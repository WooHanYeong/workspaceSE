package dao.address.third;

import java.util.ArrayList;

public class AddressDao3TestMain {

	public static void main(String[] args)throws Exception{
		AddressDao3 addressDao3=new AddressDao3();
		
		System.out.println("1.insert");
		int rowCount = addressDao3.insert("삼소라","232-6512","서울");
		System.out.println(">> insert row count : " + rowCount);
		
		Address insertAddress = new Address(0,"신명숙" ,"235-9685","강원도");
		rowCount =addressDao3.insert(insertAddress);
		System.out.println(">> insert row count : " + rowCount);


		
		System.out.println("2.updateByPrimaryKey");
		rowCount = addressDao3.updateByPrimaryKey(10,"수정님","000-0000","수정구");
		System.out.println(">> update row count : " + rowCount);
		Address updateAddress = new Address(1,"변경님","111-1111","변경구");
		rowCount = addressDao3.updateByPrimaryKey(updateAddress);

		
		System.out.println("3.deleteByPrimaryKey");
		addressDao3.deleteByPrimaryKey(14);
		System.out.println(">> delete row count : " + rowCount);
		addressDao3.deleteByPrimaryKey(15);
		System.out.println(">> delete row count : " + rowCount);

		
		System.out.println("3.findByPrimaryKey");
		Address findAddress1 = addressDao3.findByPrimaryKey(3);
		Address findAddress2 = addressDao3.findByPrimaryKey(7);
		
		System.out.println("4.findAll");
		ArrayList<Address> addressList =
				addressDao3.findAll();
		System.out.println(">>>" +addressList);

	}

}

