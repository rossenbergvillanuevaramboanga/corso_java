package it.prova.lavoratorejdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import it.prova.lavoratorejdbc.connection.MyConnection;
import it.prova.lavoratorejdbc.model.Lavoratore;

public class LavoratoreDAO {
	// =============================================== LIST
	public List<Lavoratore> elencaTuttiQuelliAttualmenteSullaBaseDati() {

		Connection c = null;
		ResultSet rs = null;
		Statement s = null;
		Lavoratore temp = null;
		List<Lavoratore> result = new ArrayList<Lavoratore>();

		try {

			c = MyConnection.getConnection();
			s = c.createStatement();

			rs = s.executeQuery("select * from lavoratore;");

			while (rs.next()) {
				temp = new Lavoratore();
				temp.setId(rs.getLong("id"));
				temp.setNome(rs.getString("nome"));
				temp.setCognome(rs.getString("cognome"));
				temp.setDataDiNascita(rs.getDate("datadinascita"));
				temp.setRal(rs.getInt("ral"));
				result.add(temp);

			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			try {
				rs.close();
				s.close();
				c.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	// =============================================== INSERT
	public int insert(Lavoratore input) {

		Connection c = null;
		PreparedStatement ps = null;
		int result = 0;

		try {

			c = MyConnection.getConnection();
			ps = c.prepareStatement(
					"INSERT INTO lavoratore (nome, cognome, datadinascita, ral) " + "VALUES (?, ?, ?,?) ");
			ps.setString(1, input.getNome());
			ps.setString(2, input.getCognome());
			// quando si fa il setDate serve un tipo java.sql.Date
			ps.setDate(3, new java.sql.Date(input.getDataDiNascita().getTime()));
			ps.setInt(4, input.getRal());

			result = ps.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			try {
				ps.close();
				c.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	// =============================================== UPDATE
	public int update(Lavoratore input) {

		if (input == null || input.getId() < 1) {
			return 0;
		}

		Connection c = null;
		PreparedStatement ps = null;
		int result = 0;

		try {

			c = MyConnection.getConnection();
			ps = c.prepareStatement("UPDATE lavoratore SET nome=?, cognome=?, " + "datadinascita=?, ral=? where id=?;");
			ps.setString(1, input.getNome());
			ps.setString(2, input.getCognome());
			// quando si fa il setDate serve un tipo java.sql.Date
			ps.setDate(3, new java.sql.Date(input.getDataDiNascita().getTime()));
			ps.setInt(4, input.getRal());
			ps.setLong(5, input.getId());

			result = ps.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			try {
				ps.close();
				c.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	// =============================================== DELETE
	public int delete(Long idElementToDelete) {

		if (idElementToDelete == null || idElementToDelete < 1) {
			return 0;
		}

		Connection c = null;
		PreparedStatement ps = null;
		int result = 0;

		try {

			c = MyConnection.getConnection();
			ps = c.prepareStatement("DELETE from lavoratore where id=?;");
			ps.setLong(1, idElementToDelete);

			result = ps.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			try {
				ps.close();
				c.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	// =============================================== FINDBYID
	public Lavoratore findById(Long input) {

		if (input == null || input < 1) {
			return null;
		}

		Connection c = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Lavoratore result = null;

		try {

			c = MyConnection.getConnection();
			ps = c.prepareStatement("select * from lavoratore u where u.id=?;");
			ps.setLong(1, input);

			rs = ps.executeQuery();

			if (rs.next()) {
				result = new Lavoratore();
				result.setId(rs.getLong("id"));
				result.setNome(rs.getString("NOME"));
				result.setCognome(rs.getString("COGNOME"));
				result.setDataDiNascita(rs.getDate("datadinascita"));
				result.setRal(rs.getInt("ral"));
			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			try {
				rs.close();
				ps.close();
				c.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	// =============================================== FINDBYID
	public List<Lavoratore> selectByNomeCognome(String nome, String cognome) {

		List<Lavoratore> result = new ArrayList<Lavoratore>();

		if (nome == null || cognome == null)
			return result;

		// Istanza connection
		Connection connection = null;
		// Istanza preparedStatement
		PreparedStatement preparedStatement = null;
		// Istanza resultset
		ResultSet resultSet = null;
		// Istanza tempLavoratoer
		Lavoratore tempLavoratore = null;

		try {

			connection = MyConnection.getConnection();

			preparedStatement = connection.prepareStatement("Select * from lavoratore where nome = ? and cognome = ?;");

			preparedStatement.setString(1, nome);
			preparedStatement.setString(2, cognome);

			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				tempLavoratore = new Lavoratore();
				tempLavoratore.setId(resultSet.getLong("id"));
				tempLavoratore.setNome(resultSet.getString("nome"));
				tempLavoratore.setCognome(resultSet.getString("cognome"));
				tempLavoratore.setDataDiNascita(resultSet.getDate("datadinascita"));
				tempLavoratore.setRal(resultSet.getInt("ral"));
				result.add(tempLavoratore);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
				preparedStatement.close();
				connection.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return result;

	}

	// =============================================== DELETEBYCOGNOME
	public int deleteByCognome(String cognome) {

		if (cognome == null)
			return 0;

		Connection c = null;
		PreparedStatement ps = null;
		int result = 0;

		try {

			c = MyConnection.getConnection();
			ps = c.prepareStatement("DELETE from lavoratore where cognome=?;");
			ps.setString(1, cognome);

			result = ps.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			try {
				ps.close();
				c.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return result;

	}

	// =============================================== FINDBYNOMEINIZIALE
	public List<Lavoratore> findAllByNomeCheIniziaPer(String iniziale) {
		
		List<Lavoratore> result = new ArrayList<Lavoratore>();
		
		if(iniziale==null) return result; 

		Connection c = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		Lavoratore temp = null;
		
		String inizialeString = iniziale + "%";

		try {

			c = MyConnection.getConnection();
			ps = c.prepareStatement("select * from lavoratore where nome like ?;");
			ps.setString(1, inizialeString);

			rs = ps.executeQuery();

			while (rs.next()) {
				temp = new Lavoratore();
				temp.setId(rs.getLong("id"));
				temp.setNome(rs.getString("nome"));
				temp.setCognome(rs.getString("cognome"));
				temp.setDataDiNascita(rs.getDate("datadinascita"));
				temp.setRal(rs.getInt("ral"));
				result.add(temp);

			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			try {
				rs.close();
				ps.close();
				c.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;

	}

	// =============================================== FINDALLNATITRA
	public List<Lavoratore> findAllNatiTra(Date before, Date after) {

		Connection c = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		Lavoratore temp = null;
		List<Lavoratore> result = new ArrayList<Lavoratore>();

		try {

			c = MyConnection.getConnection();
			ps = c.prepareStatement("select * from lavoratore where datadinascita between ? and ?;");
			ps.setDate(1, new java.sql.Date(before.getTime()));
			ps.setDate(2, new java.sql.Date(after.getTime()));
			

			rs = ps.executeQuery();

			while (rs.next()) {
				temp = new Lavoratore();
				temp.setId(rs.getLong("id"));
				temp.setNome(rs.getString("nome"));
				temp.setCognome(rs.getString("cognome"));
				temp.setDataDiNascita(rs.getDate("datadinascita"));
				temp.setRal(rs.getInt("ral"));
				result.add(temp);

			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			try {
				rs.close();
				ps.close();
				c.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;

	}
	
	// =============================================== CONTAQUANTEPERSONECONILCOGNOME
	public int contaQuantePersoneConIlCognome(String cognomeInput) {
		
		    int result = -1;
		    if(cognomeInput == null) return result;
		

			Connection c = null;
			ResultSet rs = null;
			PreparedStatement ps = null;
			
			String numeroCognomeInput = "numero"+cognomeInput;

			try {

				c = MyConnection.getConnection();
				ps = c.prepareStatement("select count(*) as ? from lavoratore where cognome = ? ;");
				ps.setString(1, numeroCognomeInput);
				ps.setString(2, cognomeInput);

				rs = ps.executeQuery();

				if (rs.next()) {
					
					result = rs.getInt(numeroCognomeInput);

				}

			} catch (Exception e) {

				e.printStackTrace();

			} finally {
				try {
					rs.close();
					ps.close();
					c.close();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return result;

		}

//			// =============================================== BY Nome and Cognome
//			public List<Lavoratore> selectByNomeCognome(String nome, String cognome) {
	//
//				Connection c = null;
//				PreparedStatement ps = null;
//				ResultSet rs = null;
//				Lavoratore temp = null;
//				List<Lavoratore> result = new ArrayList<Lavoratore>();
	//
//				try {
	//
//					c = MyConnection.getConnection();
//					ps = c.prepareStatement("select * from lavoratore u where u.nome=? and u.cognome=?;");
//					ps.setString(1, nome);
//					ps.setString(2, cognome);
	//
//					rs = ps.executeQuery();
	//
//					while (rs.next()) {
//						temp = new Lavoratore();
//						temp.setId(rs.getLong("id"));
//						temp.setNome(rs.getString("nome"));
//						temp.setCognome(rs.getString("cognome"));
//						temp.setDataDiNascita(rs.getDate("datadinascita"));
//						temp.setRal(rs.getInt("ral"));
//						result.add(temp);
	//
//					}
	//
//				} catch (Exception e) {
	//
//					e.printStackTrace();
	//
//				} finally {
//					try {
//						rs.close();
//						ps.close();
//						c.close();
	//
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//				}
//				return result;
//			}
}
