package com.shop.dao;

import java.util.ArrayList;
import java.util.List;

import com.shop.db.DBHelper;
import com.shop.db.SQL;
import com.shop.vo.CustomerVO;
import com.shop.vo.OrderVO;
import com.shop.vo.ProductVO;

public class ProductDAO extends DBHelper{
	
	// 싱글톤
	private static ProductDAO instance = new ProductDAO();
	
	public static ProductDAO getInstance() {
		return instance;
	}
	
	private ProductDAO() {}
	
	
	// 기본 CRUD 메서드
	public int insertProduct(ProductVO vo) {
		return 0;
	}
	
	
	public ProductVO selectProduct(int prodNo) {
		
		ProductVO vo = null;
		
		try {
			
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_CUSTOMER);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				vo = new ProductVO();
				
				vo.setProdNo(rs.getInt(1));	// getInt()에 컬럼명이 들어가도 상관없음.
				vo.setProdName(rs.getString(2));
				vo.setStock(rs.getInt(3));
				vo.setPrice(rs.getInt(4));
				vo.setCompany(rs.getString(5));
				
			}
			
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return vo;
	}
	
	
	public List<ProductVO> selectProducts() {
		
		List<ProductVO> product = new ArrayList<>();
		
		try {
			
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_PRODUCTS);
			rs = psmt.executeQuery();
			
			
			
			while(rs.next()) {
				
				ProductVO vo = new ProductVO();
				
				vo.setProdNo(rs.getInt(1));	// getInt()에 컬럼명이 들어가도 상관없음.
				vo.setProdName(rs.getString(2));
				vo.setStock(rs.getInt(3));
				vo.setPrice(rs.getInt(4));
				vo.setCompany(rs.getString(5));
				
				product.add(vo);
				
			}
			close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return product;
	}
	
	
	public int updateProduct(ProductVO vo) {
		
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public void updateProductStock(int prodNo, int prodCount) {
		
		try {
			
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.UPDATE_ORDER_STOCK_COUNT);
			psmt.setInt(1, prodCount);
			psmt.setInt(2, prodNo);
			
			psmt.executeUpdate();
			
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
	
	
	
	public int deleteProduct(String prodNo) {
		return 0;
	}

}
