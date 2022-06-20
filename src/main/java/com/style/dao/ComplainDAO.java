package com.style.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.style.dto.ComplainDTO;

import util.DBManager;

public class ComplainDAO {
	private ComplainDAO() {
	}

	private static ComplainDAO instance = new ComplainDAO();

	public static ComplainDAO getInstance() {
		return instance;
	}

	public List<ComplainDTO> selectAllComplains() {
		String sql = "select * from complain order by num asc";

		List<ComplainDTO> list = new ArrayList<ComplainDTO>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBManager.getConnection();
			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				ComplainDTO cDto = new ComplainDTO();

				cDto.setNum(rs.getInt("num"));
				cDto.setComp_kind(rs.getString("comp_kind"));
				cDto.setId(rs.getString("id"));
				cDto.setName(rs.getString("name"));
				cDto.setTitle(rs.getString("title"));
				cDto.setContent(rs.getString("content"));
				cDto.setReadcount(rs.getInt("readcount"));
				cDto.setWritedate(rs.getTimestamp("writedate"));

				list.add(cDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, stmt, rs);
		}
		return list;
	} // 게시판 목록보기

	public void insertComplain(ComplainDTO cDto) {
		String sql = "insert into complain(" + "num, comp_kind, id, name, title, content) "
				+ "values(board_seq.nextval, ?, ?, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, cDto.getComp_kind());
			pstmt.setString(2, cDto.getId());
			pstmt.setString(3, cDto.getName());
			pstmt.setString(4, cDto.getTitle());
			pstmt.setString(5, cDto.getContent());

			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}

	public void updateReadCount(String num) {
		String sql = "update complain set readcount=readcount+1 where num=?";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBManager.getConnection();

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);

			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}

	public ComplainDTO selectOneComplainbyNum(String num) {
		String sql = "select * from complain where num = ?";

		ComplainDTO cDto = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBManager.getConnection();

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				cDto = new ComplainDTO();

				cDto.setNum(rs.getInt("num"));
				cDto.setComp_kind(rs.getString("comp_kind"));
				cDto.setId(rs.getString("id"));
				cDto.setName(rs.getString("name"));
				cDto.setTitle(rs.getString("title"));
				cDto.setContent(rs.getString("content"));
				cDto.setReadcount(rs.getInt("readcount"));
				cDto.setWritedate(rs.getTimestamp("writedate"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return cDto;
	}

	public void updateComplain(ComplainDTO cDto) {
		String sql = "update complain set comp_kind=?, id=?, name=?, title=?, content=? where num=?";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBManager.getConnection();

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cDto.getComp_kind());
			pstmt.setString(2, cDto.getId());
			pstmt.setString(3, cDto.getName());
			pstmt.setString(4, cDto.getTitle());
			pstmt.setString(5, cDto.getContent());
			pstmt.setInt(6, cDto.getNum());

			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}

	public void deleteComplain(String num) {
		String sql = "delete complain where num=?";

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

}
