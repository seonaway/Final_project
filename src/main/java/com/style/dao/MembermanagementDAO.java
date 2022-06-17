package com.style.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.style.dto.MembermanagementDTO;

import util.DBManager;

public class MembermanagementDAO {
	private MembermanagementDAO() {
	}

	private static MembermanagementDAO instance = new MembermanagementDAO();

	public static MembermanagementDAO getInstance() {
		return instance;
	}

	public List<MembermanagementDTO> selectAllMembermanagements() {
		String sql = "select * from membermanagement order by num asc";

		List<MembermanagementDTO> list = new ArrayList<MembermanagementDTO>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBManager.getConnection();
			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				MembermanagementDTO mDto = new MembermanagementDTO();

				mDto.setNum(rs.getInt("num"));
				mDto.setMem_id(rs.getString("mem_id"));
				mDto.setMem_nick(rs.getString("mem_nick"));
				mDto.setMem_pwd(rs.getString("mem_pwd"));
				mDto.setMem_name(rs.getString("mem_name"));
				mDto.setMem_addr(rs.getString("mem_addr"));
				mDto.setMem_postnum(rs.getString("mem_postnum"));
				mDto.setMem_phone(rs.getString("mem_phone"));

				list.add(mDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, stmt, rs);
		}
		return list;
	}

	public void insertMembermanagement(MembermanagementDTO mDto) {
		String sql = "insert into membermanagement("
				+ "num, mem_id, mem_nick, mem_pwd, mem_name, mem_addr,mem_postnum,mem_phone,mem_usertype) "
				+ "values(member_seq.nextval, ?, ?, ?, ?, ?, ?, ?,0)";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, mDto.getMem_id());
			pstmt.setString(2, mDto.getMem_nick());
			pstmt.setString(3, mDto.getMem_pwd());
			pstmt.setString(4, mDto.getMem_name());
			pstmt.setString(5, mDto.getMem_addr());
			pstmt.setString(6, mDto.getMem_postnum());
			pstmt.setString(7, mDto.getMem_phone());

			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}

	public MembermanagementDTO selectOneMembermanagementbyNum(String num) {
		String sql = "select * from membermanagement where num = ?";

		MembermanagementDTO mDto = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBManager.getConnection();

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				mDto = new MembermanagementDTO();

				mDto.setNum(rs.getInt("num"));
				mDto.setMem_id(rs.getString("mem_id"));
				mDto.setMem_nick(rs.getString("mem_nick"));
				mDto.setMem_pwd(rs.getString("mem_pwd"));
				mDto.setMem_name(rs.getString("mem_name"));
				mDto.setMem_addr(rs.getString("mem_addr"));
				mDto.setMem_postnum(rs.getString("mem_postnum"));
				mDto.setMem_phone(rs.getString("mem_phone"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return mDto;
	}

	public void updateMembermanagement(MembermanagementDTO mDto) {
		String sql = "update membermanagement set mem_id=?, mem_nick=?, mem_pwd=?, mem_name=?, mem_addr=?, mem_postnum=?, mem_phone=? where num=?";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBManager.getConnection();

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mDto.getMem_id());
			pstmt.setString(2, mDto.getMem_nick());
			pstmt.setString(3, mDto.getMem_pwd());
			pstmt.setString(4, mDto.getMem_name());
			pstmt.setString(5, mDto.getMem_addr());
			pstmt.setString(6, mDto.getMem_postnum());
			pstmt.setString(7, mDto.getMem_phone());
			pstmt.setInt(8, mDto.getNum());

			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}

	public void deleteMembermanagement(String num) {
		String sql = "delete membermanagement where num=?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, num);

			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public MembermanagementDTO checkLogin(String mem_id,String mem_pwd) {
		String sql = "select * from membermanagement where mem_id=? and mem_pwd=?";
		
		MembermanagementDTO mDto = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mem_id);
			pstmt.setString(2, mem_pwd);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				
				mDto = new MembermanagementDTO();

				mDto.setNum(rs.getInt("num"));
				mDto.setMem_id(rs.getString("mem_id"));
				mDto.setMem_nick(rs.getString("mem_nick"));
				mDto.setMem_pwd(rs.getString("mem_pwd"));
				mDto.setMem_name(rs.getString("mem_name"));
				mDto.setMem_addr(rs.getString("mem_addr"));
				mDto.setMem_postnum(rs.getString("mem_postnum"));
				mDto.setMem_phone(rs.getString("mem_phone"));
				mDto.setMem_usertype(rs.getString("mem_usertype"));
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return mDto;
	}
}
