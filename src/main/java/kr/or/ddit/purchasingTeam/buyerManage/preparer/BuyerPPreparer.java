package kr.or.ddit.purchasingTeam.buyerManage.preparer;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.tiles.AttributeContext;
import org.apache.tiles.preparer.ViewPreparer;
import org.apache.tiles.request.Request;

import kr.or.ddit.common.annotation.Preparer;

@Preparer
public class BuyerPPreparer implements ViewPreparer{
	@Override
	public void execute(Request arg0, AttributeContext arg1) {
		Map<String, String> menuMap = new LinkedHashMap<>();
		menuMap.put("/purchasingTeam/buyerManage/buyerList", "거래처조회");
		menuMap.put("/purchasingTeam/buyerManage/buyerInsert", "거래처등록");
		
		Map<String, Object> requestScope = arg0.getContext(Request.REQUEST_SCOPE);
		requestScope.put("menus", menuMap);		
		
	}
}
