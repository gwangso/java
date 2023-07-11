package ex07;

import java.util.*;

public interface SaleDAO {
	public List<SaleVO> list(int pcode) throws Exception;
	
	public void insert(SaleVO vo) throws Exception;
	
	public List<SaleVO> sum_list();
	
}
