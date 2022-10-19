package it.prova.primoonetomany.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.prova.primoonetomany.connection.MyConnection;
import it.prova.primoonetomany.model.Articolo;
import it.prova.primoonetomany.model.Negozio;

public class ArticoloDAO {

	public List<Articolo> list() {

		List<Articolo> result = new ArrayList<Articolo>();

		try (Connection c = MyConnection.getConnection();
				Statement s = c.createStatement();
				// STRATEGIA EAGER FETCHING
				ResultSet rs = s.executeQuery("select * from articolo a inner join negozio n on n.id=a.negozio_id")) {

			while (rs.next()) {
				Articolo articoloTemp = new Articolo();
				articoloTemp.setNome(rs.getString("NOME"));
				articoloTemp.setMatricola(rs.getString("matricola"));
				articoloTemp.setId(rs.getLong("a.id"));

				Negozio negozioTemp = new Negozio();
				negozioTemp.setId(rs.getLong("n.id"));
				negozioTemp.setNome(rs.getString("nome"));
				negozioTemp.setIndirizzo(rs.getString("indirizzo"));

				articoloTemp.setNegozio(negozioTemp);
				result.add(articoloTemp);
			}

		} catch (Exception e) {
			e.printStackTrace();
			// rilancio in modo tale da avvertire il chiamante
			throw new RuntimeException(e);
		}
		return result;
	}

	public Articolo findById(Long idArticoloInput) {

		if (idArticoloInput == null || idArticoloInput < 1)
			throw new RuntimeException("Impossibile recuperare Articolo: id mancante!");

		Articolo result = null;
		try (Connection c = MyConnection.getConnection();
				PreparedStatement ps = c.prepareStatement("select * from articolo a where a.id=?")) {

			ps.setLong(1, idArticoloInput);
			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next()) {
					result = new Articolo();
					result.setNome(rs.getString("NOME"));
					result.setMatricola(rs.getString("matricola"));
					result.setId(rs.getLong("id"));
				} else {
					result = null;
				}
			} // niente catch qui

		} catch (Exception e) {
			e.printStackTrace();
			// rilancio in modo tale da avvertire il chiamante
			throw new RuntimeException(e);
		}
		return result;
	}

	public int insert(Articolo articoloInput) {

		if (articoloInput.getNegozio() == null || articoloInput.getNegozio().getId() < 1)
			throw new RuntimeException("Impossibile inserire Articolo: Negozio mancante!");

		int result = 0;
		try (Connection c = MyConnection.getConnection();
				PreparedStatement ps = c
						.prepareStatement("INSERT INTO articolo (nome, matricola,negozio_id) VALUES (?, ?, ?)")) {

			ps.setString(1, articoloInput.getNome());
			ps.setString(2, articoloInput.getMatricola());
			ps.setLong(3, articoloInput.getNegozio().getId());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			// rilancio in modo tale da avvertire il chiamante
			throw new RuntimeException(e);
		}
		return result;
	}

	// TODO
	public Articolo findByIdEager(Long idInput) {
		if (idInput == null || idInput < 1)
			throw new RuntimeException("Impossibile trovare articoli nel negozio: input mancante!");
		
		Articolo result = new Articolo();
		Articolo articoloTemp = null;
		Negozio negozioTemp = null;
		
		try(Connection c= MyConnection.getConnection();
				PreparedStatement ps = c.prepareStatement("select * from articolo a inner join negozio n on n.id=a.negozio_id where a.id= ?;")){
			
			ps.setLong(1,idInput);
			
			try(ResultSet rs = ps.executeQuery()){
				
				if (rs.next()) {
					articoloTemp = new Articolo();
					articoloTemp.setNome(rs.getString("a.nome"));
					articoloTemp.setMatricola(rs.getString("matricola"));
					articoloTemp.setId(rs.getLong("a.id"));

					negozioTemp = new Negozio();
					negozioTemp.setId(rs.getLong("n.id"));
					negozioTemp.setNome(rs.getString("n.nome"));
					negozioTemp.setIndirizzo(rs.getString("indirizzo"));

					articoloTemp.setNegozio(negozioTemp);
					result = articoloTemp;
				}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return result;
	}

	public int update(Articolo articoloInput) {
		
		if (articoloInput == null || articoloInput.getId() < 1)
			return 0;

		int result = 0;

		try (Connection c = MyConnection.getConnection();
				PreparedStatement ps = c
						.prepareStatement("UPDATE articolo SET nome = ?, matricola = ? , negozio_id = ? WHERE id = ? ; ")) {

			ps.setString(1, articoloInput.getNome());
			ps.setString(2, articoloInput.getMatricola());
			ps.setLong(3, articoloInput.getNegozio().getId());
			ps.setLong(4, articoloInput.getId());
			result = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return result;
	}

	public int delete(Long idToDelete) {
		
		if (idToDelete == null || idToDelete < 1)
			return 0;

		int result = 0;

		try (Connection c = MyConnection.getConnection();
				PreparedStatement ps = c.prepareStatement("DELETE FROM articolo WHERE id = ? ; ")) {

			ps.setLong(1, idToDelete);
			result = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return result;
	}

	// implementare inoltre
	public List<Articolo> findAllByNegozio(Negozio negozioInput) {
		
		if (negozioInput == null || negozioInput.getId() < 1)
			throw new RuntimeException("Impossibile trovare articoli nel negozio: input mancante!");
		
		List<Articolo> result = new ArrayList<Articolo>();
		Articolo articoloTemp = null;
		Negozio negozioTemp = null;
		
		try(Connection c= MyConnection.getConnection();
				PreparedStatement ps = c.prepareStatement("select * from articolo a inner join negozio n on n.id=a.negozio_id where n.nome= ?;")){
			
			ps.setString(1,negozioInput.getNome());
			
			try(ResultSet rs = ps.executeQuery()){
				
				while (rs.next()) {
					articoloTemp = new Articolo();
					articoloTemp.setNome(rs.getString("a.nome"));
					articoloTemp.setMatricola(rs.getString("matricola"));
					articoloTemp.setId(rs.getLong("a.id"));

					negozioTemp = new Negozio();
					negozioTemp.setId(rs.getLong("n.id"));
					negozioTemp.setNome(rs.getString("n.nome"));
					negozioTemp.setIndirizzo(rs.getString("indirizzo"));

					articoloTemp.setNegozio(negozioTemp);
					result.add(articoloTemp);
				}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return result;
	}

	public List<Articolo> findAllByMatricola(String matricolaInput) {
		
		if (matricolaInput == null || matricolaInput.length() < 1)
			throw new RuntimeException("Impossibile trovare articoli nel negozio: input mancante!");
		
		List<Articolo> result = new ArrayList<Articolo>();
		Articolo articoloTemp = null;
		Negozio negozioTemp = null;
		
		try(Connection c= MyConnection.getConnection();
				PreparedStatement ps = c.prepareStatement("select * from articolo a inner join negozio n on n.id=a.negozio_id where a.matricola= ?;")){
			
			ps.setString(1,matricolaInput);
			
			try(ResultSet rs = ps.executeQuery()){
				
				while (rs.next()) {
					articoloTemp = new Articolo();
					articoloTemp.setNome(rs.getString("NOME"));
					articoloTemp.setMatricola(rs.getString("matricola"));
					articoloTemp.setId(rs.getLong("a.id"));

					negozioTemp = new Negozio();
					negozioTemp.setId(rs.getLong("n.id"));
					negozioTemp.setNome(rs.getString("nome"));
					negozioTemp.setIndirizzo(rs.getString("indirizzo"));

					articoloTemp.setNegozio(negozioTemp);
					result.add(articoloTemp);
				}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return result;
	}

	public List<Articolo> findAllByIndirizzoNegozio(String indirizzoNegozioInput) {
		
		if (indirizzoNegozioInput == null || indirizzoNegozioInput.length() < 1)
			throw new RuntimeException("Impossibile trovare articoli nel negozio: input mancante!");
		
		List<Articolo> result = new ArrayList<Articolo>();
		Articolo articoloTemp = null;
		Negozio negozioTemp = null;
		
		try(Connection c= MyConnection.getConnection();
				PreparedStatement ps = c.prepareStatement("select * from articolo a inner join negozio n on n.id=a.negozio_id where n.indirizzo= ?;")){
			
			ps.setString(1,indirizzoNegozioInput);
			
			try(ResultSet rs = ps.executeQuery()){
				
				while (rs.next()) {
					articoloTemp = new Articolo();
					articoloTemp.setNome(rs.getString("NOME"));
					articoloTemp.setMatricola(rs.getString("matricola"));
					articoloTemp.setId(rs.getLong("a.id"));

					negozioTemp = new Negozio();
					negozioTemp.setId(rs.getLong("n.id"));
					negozioTemp.setNome(rs.getString("nome"));
					negozioTemp.setIndirizzo(rs.getString("indirizzo"));

					articoloTemp.setNegozio(negozioTemp);
					result.add(articoloTemp);
				}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return result;
	}

}
