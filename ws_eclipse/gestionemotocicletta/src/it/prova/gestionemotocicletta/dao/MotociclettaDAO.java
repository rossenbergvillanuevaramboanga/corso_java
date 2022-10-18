package it.prova.gestionemotocicletta.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import it.prova.gestionemotocicletta.connection.MyConnection;
import it.prova.gestionemotocicletta.model.*;

public class MotociclettaDAO {

	// ------------------------------------- SELECTALL
	public List<Motocicletta> selectAll() {

		Connection c = null;
		ResultSet rs = null;
		Statement s = null;
		Motocicletta temp = null;

		List<Motocicletta> result = new ArrayList<Motocicletta>();

		// Esecuzione della connessione
		try {

			c = MyConnection.getConnection();
			s = c.createStatement();
			rs = s.executeQuery("Select * from motocicletta");

			while (rs.next()) {
				temp = new Motocicletta();
				temp.setId(rs.getLong("id"));
				temp.setMarca(rs.getString("marca"));
				temp.setModello(rs.getString("modello"));
				temp.setCilindrata(rs.getInt("cilindrata"));
				result.add(temp);

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		} finally {
			try {
				rs.close();
				s.close();
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return result;

	}

	// ------------------------------------- INSERT
	public int insert(Motocicletta motocicletta) {

		if (motocicletta == null)
			return 0;

		Connection c = null;
		PreparedStatement ps = null;
		int result = 0;

		try {
			c = MyConnection.getConnection();
			ps = c.prepareStatement("Insert into motocicletta (marca,modello,cilindrata) values (?,?,?);");
			ps.setString(1, motocicletta.getMarca());
			ps.setString(2, motocicletta.getModello());
			ps.setInt(3, motocicletta.getCilindrata());

			result = ps.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			;
		} finally {
			try {
				ps.close();
				c.close();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}

		return result;

	}

	// ------------------------------------- UPDATE
	public int update(Motocicletta motocicletta) {

		if (motocicletta == null || motocicletta.getId() < 1)
			return 0;

		Connection c = null;
		PreparedStatement ps = null;
		int result = 0;

		try {
			c = MyConnection.getConnection();
			ps = c.prepareStatement("Update motocicletta set marca = ?, modello = ?, cilindrata = ? where id = ? ; ");
			ps.setString(1, motocicletta.getMarca());
			ps.setString(2, motocicletta.getModello());
			ps.setInt(3, motocicletta.getCilindrata());
			ps.setLong(4, motocicletta.getId());

			result = ps.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			;
		} finally {
			try {
				ps.close();
				c.close();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}

		return result;

	}

	// ------------------------------------- DELETE
	public int delete(Long idMotocicletta) {

		if (idMotocicletta == null || idMotocicletta < 1)
			return 0;

		Connection c = null;
		PreparedStatement ps = null;
		int result = 0;

		try {
			c = MyConnection.getConnection();
			ps = c.prepareStatement("Delete from motocicletta where id = ? ; ");
			ps.setLong(1, idMotocicletta);

			result = ps.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			;
		} finally {
			try {
				ps.close();
				c.close();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}

		return result;

	}

	// ------------------------------------- FINDBYID
	public Motocicletta findById(Long idMotocicletta) {

		if (idMotocicletta == null || idMotocicletta < 1)
			return null;

		Connection c = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Motocicletta result = null;

		try {
			c = MyConnection.getConnection();
			ps = c.prepareStatement("Select * from motocicletta where id = ? ; ");
			ps.setLong(1, idMotocicletta);

			rs = ps.executeQuery();

			if (rs.next()) {

				result = new Motocicletta();
				result.setId(rs.getLong("id"));
				result.setMarca(rs.getString("marca"));
				result.setModello(rs.getString("modello"));
				result.setCilindrata(rs.getInt("cilindrata"));

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			;
		} finally {
			try {
				rs.close();
				ps.close();
				c.close();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}

		return result;

	}

	/*
	 * Esercizi per case: Implementare nel MotociclettaDAO i seguenti metodi 
	 * 1. public List<Motocicletta> findAllByCilindrataMaggioreDi(int sogliaMin) 
	 * 2. public List<Motocicletta> findAllByModelloAndCilindrataMinoreDi(String modello, int sogliaMax)
	 * 3.public List<Motocicletta> findAllByCilindrataBetween(int cilindrataMin, int cilindrataMax)
	 * 4. public List<Motocicletta> findAllByMarcaAndModelloIn(String marca, String [] elencoModelliAmmessi)
	 */

	public List<Motocicletta> findAllByCilindrataMaggioreDi(int sogliaMin) {

		if (sogliaMin < 0)
			return null;

		Connection c = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		Motocicletta temp = null;

		List<Motocicletta> result = new ArrayList<Motocicletta>();

		// Esecuzione della connessione
		try {

			c = MyConnection.getConnection();
			ps = c.prepareStatement("Select *  from motocicletta where cilindrata > ?;");
			ps.setInt(1, sogliaMin);
			rs = ps.executeQuery();

			while (rs.next()) {
				temp = new Motocicletta();
				temp.setId(rs.getLong("id"));
				temp.setMarca(rs.getString("marca"));
				temp.setModello(rs.getString("modello"));
				temp.setCilindrata(rs.getInt("cilindrata"));
				result.add(temp);

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		} finally {
			try {
				rs.close();
				ps.close();
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return result;
	}

	public List<Motocicletta> findAllByModelloAndCilindrataMinoreDi(String modello, int sogliaMax) {

		if (modello == null || sogliaMax < 0)
			return null;

		Connection c = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		Motocicletta temp = null;

		List<Motocicletta> result = new ArrayList<Motocicletta>();

		// Esecuzione della connessione
		try {

			c = MyConnection.getConnection();
			ps = c.prepareStatement("Select *  from motocicletta where modello = ? and cilindrata < ?;");
			ps.setString(1, modello);
			ps.setInt(2, sogliaMax);
			rs = ps.executeQuery();

			while (rs.next()) {
				temp = new Motocicletta();
				temp.setId(rs.getLong("id"));
				temp.setMarca(rs.getString("marca"));
				temp.setModello(rs.getString("modello"));
				temp.setCilindrata(rs.getInt("cilindrata"));
				result.add(temp);

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		} finally {
			try {
				rs.close();
				ps.close();
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return result;
	}

	public List<Motocicletta> findAllByCilindrataBetween(int cilindrataMin, int cilindrataMax) {

		if (cilindrataMin < 0 || cilindrataMax < 0)
			return null;

		Connection c = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		Motocicletta temp = null;

		List<Motocicletta> result = new ArrayList<Motocicletta>();

		// Esecuzione della connessione
		try {

			c = MyConnection.getConnection();
			ps = c.prepareStatement("Select *  from motocicletta where cilindrata between ? and ? ;");
			ps.setInt(1, cilindrataMin);
			ps.setInt(2, cilindrataMax);
			rs = ps.executeQuery();

			while (rs.next()) {
				temp = new Motocicletta();
				temp.setId(rs.getLong("id"));
				temp.setMarca(rs.getString("marca"));
				temp.setModello(rs.getString("modello"));
				temp.setCilindrata(rs.getInt("cilindrata"));
				result.add(temp);

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		} finally {
			try {
				rs.close();
				ps.close();
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return result;
	}

	public List<Motocicletta> findAllByMarcaAndModelloIn(String marca, String[] elencoModelliAmmessi) {

		if (marca == null || elencoModelliAmmessi == null || elencoModelliAmmessi.length == 0)
			return null;

		Connection c = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		Motocicletta temp = null;

		List<Motocicletta> result = new ArrayList<Motocicletta>();

		// Esecuzione della connessione
		try {
			
			c = MyConnection.getConnection();
			
			String placeholder = "?";


			for (int i = 1; i < elencoModelliAmmessi.length; i++) {
				placeholder += ", ?";
				
			}
				

			
			ps = c.prepareStatement("Select *  from motocicletta where marca = ? and modello in ("+ placeholder +");");

			ps.setString(1, marca);
			
			
			for(String elem : elencoModelliAmmessi) {
				ps.setString(2, elem);
			}	

			
			
			rs = ps.executeQuery();

			while (rs.next()) {
				temp = new Motocicletta();
				temp.setId(rs.getLong("id"));
				temp.setMarca(rs.getString("marca"));
				temp.setModello(rs.getString("modello"));
				temp.setCilindrata(rs.getInt("cilindrata"));
				result.add(temp);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		} finally {
			try {

				rs.close();
				ps.close();
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return result;

	}

}
