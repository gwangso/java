package ex07;

import java.util.*;

public interface ProductDAO { //DAO = database access object
	//인터페이스는 껍대기만 만드는것
	public void insert(ProductVO vo) throws Exception;
	
	public void update(ProductVO vo) throws Exception;
	
	public void delete(int pcode) throws Exception;
	
	public ProductVO search(int pcode) throws Exception;
	
	public List<ProductVO> list() throws Exception;
	
}