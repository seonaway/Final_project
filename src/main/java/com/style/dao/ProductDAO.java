package com.style.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.style.dto.ProductVO;

import util.DBManager;

public class ProductDAO {
	private ProductDAO() {
	}

	private static ProductDAO instance = new ProductDAO();

	public static ProductDAO getInstance() {
		return instance;
	}

	// c Read u d
	public List<ProductVO> selectAllProducts() {
		// 최근 등록한 상품 먼저 출력하기
		String sql = "select * from product order by pnum desc";
		List<ProductVO> list = new ArrayList<ProductVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {// 이동은 행(로우) 단위로
				ProductVO pVo = new ProductVO();
				pVo.setPnum(rs.getInt("pnum"));
				pVo.setPname(rs.getString("pname"));
				pVo.setPbrand(rs.getString("pbrand"));
				pVo.setPprice(rs.getInt("pprice"));
				pVo.setPnew_price(rs.getInt("pnew_price"));
				pVo.setPmodel(rs.getString("pmodel"));
				pVo.setPgrade(rs.getString("pgrade"));
				pVo.setPdetail(rs.getString("pdetail"));
				pVo.setPkind(rs.getString("pkind"));
				pVo.setPquantity(rs.getInt("pquantity"));
				pVo.setPpictureUrl(rs.getString("ppictureUrl"));
				list.add(pVo);
			} // while문 끝

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);

		}
		return list;

	}// selectAllProducts() {

	public void insertProduct(ProductVO pVo) {
		String sql = "insert into product(pnum, pname, "
				+ "pbrand,pprice, pnew_price, pmodel, pgrade, pdetail, pkind, pquantity, ppictureurl) "
				+ "values(product_seq.nextval,?,?,?,?,?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pVo.getPname());
			pstmt.setString(2, pVo.getPbrand());
			pstmt.setInt(3, pVo.getPprice());
			pstmt.setInt(4, pVo.getPnew_price());
			pstmt.setString(5, pVo.getPmodel());
			pstmt.setString(6, pVo.getPgrade());
			pstmt.setString(7, pVo.getPdetail());
			pstmt.setString(8, pVo.getPkind());
			pstmt.setInt(9, pVo.getPquantity());
			pstmt.setString(10, pVo.getPpictureUrl());

			pstmt.executeUpdate();// 실행
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}

	// product 테이블에서 게시글 번호로 해당 게시글을 찾아 게시글 정보를 ProductVO 객체로 얻어준다.
	// product DAO 클래스에 상품 등록을 위한 메소드 추가
	public ProductVO selectOneProductByPnum(String pnum) {
		String sql = "select * from product where pnum =?";

		ProductVO pVo = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pnum);
			rs = pstmt.executeQuery();
			// 웹스토어 참고.05.18
			// if (!rs.next()) {
			// return null;
			// }

			if (rs.next()) {

				pVo = new ProductVO();
				pVo.setPnum(rs.getInt("pnum"));
				pVo.setPname(rs.getString("pname"));
				pVo.setPbrand(rs.getString("pbrand"));
				pVo.setPprice(rs.getInt("pprice"));
				pVo.setPnew_price(rs.getInt("pnew_price"));
				pVo.setPmodel(rs.getString("pmodel"));
				pVo.setPgrade(rs.getString("pgrade"));
				pVo.setPdetail(rs.getString("pdetail"));
				pVo.setPkind(rs.getString("pkind"));
				pVo.setPdate(rs.getTimestamp("pdate"));
				pVo.setPquantity(rs.getInt("pquantity"));
				pVo.setPpictureUrl(rs.getString("ppictureUrl"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return pVo;
	}

	// 매개 변수로 받은 VO객체 내의 코드로 product 테이블에서 검색해서 VO객체에 저장된
//	정보로 게시글 정보를 수집한다
	public void updateProduct(ProductVO pVo) {
		String sql = "update product set pname=?, pbrand=?, pprice=?, pnew_price=?, pmodel=?, "
				+ "pgrade=?, pdetail=?, pkind=?, pquantity=?, ppictureurl=? where pnum=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBManager.getConnection();

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, pVo.getPname());
			pstmt.setString(2, pVo.getPbrand());
			pstmt.setInt(3, pVo.getPprice());
			pstmt.setInt(4, pVo.getPnew_price());
			pstmt.setString(5, pVo.getPmodel());
			pstmt.setString(6, pVo.getPgrade());
			pstmt.setString(7, pVo.getPdetail());
			pstmt.setString(8, pVo.getPkind());
			pstmt.setInt(9, pVo.getPquantity());
			pstmt.setString(10, pVo.getPpictureUrl());
			pstmt.setInt(11, pVo.getPnum());

			pstmt.executeUpdate();// 쿼리문 실행
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}

	public void deleteProduct(String pnum) {
		// productDelete.jsp에서 삭제할 상품코드 hidden으로 보내줌
		String sql = "delete product where pnum=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pnum);
			pstmt.executeUpdate();// 쿼리문 실행
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}

}// ProductDAO{
