package com.bank.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.bank.dao.BankDAO;
import com.bank.dbutil.PostgresConnection;
import com.bank.exception.BusinessException;
import com.bank.model.Bank;
import com.bank.model.Customer;

public class BankDAOImpl implements BankDAO{
	private static Logger log = Logger.getLogger(BankDAO.class);

	@Override
	public List<Bank> getCustomerDetailsByUsername(String username) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bank> getTransactionDetailsByTid(int tid) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bank registerCustomer(Bank bank) throws BusinessException {
		try(Connection connection = PostgresConnection.getConnection()){
			String sql = "insert into custlogindetails(name,email,username,password) values(?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareCall(sql);
			preparedStatement.setString(1, bank.getName());
			preparedStatement.setString(2, bank.getEmail());
			preparedStatement.setString(3, bank.getUsername());
			preparedStatement.setString(4, bank.getPassword());
			int rowAffected = preparedStatement.executeUpdate();
			if(rowAffected!=1) {
				log.info("Rows not affected");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			log.warn(e.getMessage());
			throw new BusinessException("Internal Error Occured... Kindly contact SysAdmin");
		}
		return bank;
	}

	@Override
	public Bank openCustomerAccount(Bank bank) throws BusinessException {
		try(Connection connection = PostgresConnection.getConnection()){
			String sql = "insert into custaccountdetails(custusername,custfname,custlname,custgender,custdob,custmobileno,custoccupation,custcity,custstate,initialamount)values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareCall(sql);
			preparedStatement.setString(1,bank.getCustUserName());
			preparedStatement.setString(2,bank.getCustFname());
			preparedStatement.setString(3,bank.getCustLname());
			preparedStatement.setString(4,bank.getCustGender());
			preparedStatement.setString(5,bank.getCustDob());
			preparedStatement.setLong(6, bank.getCustMobileno());
			preparedStatement.setString(7,bank.getCustPan());
			preparedStatement.setString(8,bank.getCustCity());
			preparedStatement.setString(9,bank.getCustState());
			preparedStatement.setFloat(10, bank.getInitialAmount());
			int rowAffected = preparedStatement.executeUpdate();
			if(rowAffected!=1) {
				log.info("Rows not affected");
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.warn(e.getMessage());
			throw new BusinessException("Internal Error Occured... Kindly contact SysAdmin");
		}
		return bank;
	}

	@Override
	public List<Bank> getAllCustomerDetails(Bank bank) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bank employeeLogin(Bank bank) throws BusinessException {
		try(Connection connection = PostgresConnection.getConnection()){
			String sql="select empusername,emppassword from employeedetails";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				bank.setEmpUsername(resultSet.getString("empusername"));
				bank.setEmpPassword(resultSet.getString("emppassword"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.warn(e.getMessage());
			throw new BusinessException("Internal Error Occured... Kindly contact SysAdmin");
		}
		return bank;
	}

	@Override
	public Customer customerLogin(Customer customer) throws BusinessException {
		try(Connection connection = PostgresConnection.getConnection()){
			String sql="select username,password from custlogindetails";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				customer.setCustUserName(resultSet.getString("username"));
				customer.setCustPassword(resultSet.getString("password"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.warn(e.getMessage());
			throw new BusinessException("Internal Error Occured... Kindly contact SysAdmin");
		}
		return customer;
	}

}
