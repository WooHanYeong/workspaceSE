import com.itwill.shop.ShopService;
import com.itwill.shop.member.Member;
import com.itwill.shop.member.MemberService;
import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductService;

/*
<< The import com.itwill.shop.admin.Product collides with another import statement >>
import com.itwill.shop.admin.Product;
패키지를 제외한 클래스이름이 동일한클래스는 둘다 import가 불가능하다

*/
public class PackageImportantMain {
	
	/*
	 * <<자동 import 단축키>>
	 * ctr +shift+o
	 */
	
	public static void main(String[] args) {
		
		ShopService shopService=new ShopService();
		System.out.println(shopService);
		Member member=new Member();
		System.out.println(member);
		MemberService memberService=new MemberService();
		System.out.println(memberService);
		System.out.println("-----com.itwill.shop.product.Product,com.itwill.shop.product.ProductService------");
		Product shopProduct=new Product();
		System.out.println(shopProduct);
		ProductService productService=new ProductService();
		System.out.println(productService);
		System.out.println("-----com.itwill.shop.admin.Product,com.itwill.shop.admin.ProductService----------");
		Product adminProduct=new Product();
		System.out.println(adminProduct);
		com.itwill.shop.admin.ProductService adminProductService =
				new com.itwill.shop.admin.ProductService();
		System.out.println(adminProductService);
		
	}

}
