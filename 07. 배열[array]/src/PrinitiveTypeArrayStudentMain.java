

public class PrinitiveTypeArrayStudentMain {

	public static void main(String[] args) {
		
		System.out.println("-------학생10명 성적데이타를 저장하기위한배열객체생성&초기화-------\n");
		int[] noArray=       {1,2,3,4,5,6,7,8,9,10};
		 String[] nameArray=  {"KIM","LEE","PARK","CHOI","SIM","KIM","PIM","MIN","AIM","LIM"};
		 int[] korArray=      {80,90,45,78,45,80,99,71,63,89};
		 int[] engArray=      {98,45,23,68,71,95,80,37,55,88};
		 int[] mathArray=     {99,97,93,77,83,56,67,82,88,12};
		 int[] totArray=      {0,0,0,0,0,0,0,0,0,0};
		 double[] avgArray=   {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
		 char[] gradeArray= {'F','F','F','F','F','F','F','F','F','F'};
		 int[] rankArray= {1,1,1,1,1,1,1,1,1,1};
		 
		 
		 /*
		  * 총점,평균,평점계산.
		 */
		 for(int i=0;i<noArray.length;i++) {
			 totArray[i]=korArray[i]+engArray[i]+mathArray[i];
			 avgArray[i]=totArray[i]/3.0;
			 if(avgArray[i]>=90) {
				 gradeArray[i]='A';
			 }else if(avgArray[i]>=80) {
				 gradeArray[i]='B';
			 }else if(avgArray[i]>=70) {
				 gradeArray[i]='C';
			 }else if(avgArray[i]>=60) {
				 gradeArray[i]='D';
			 }else {
				 gradeArray[i]='F';
			 }
		 }
			
		/*
		 * 총점으로 석차
		 */
		for(int k=0; k<totArray.length;k++) {
		 	for(int j =0;j<totArray.length;j++) {
		 		if(totArray[k]<totArray[j]) {
		 			rankArray[k]++;
		 		}
		 	}
		}
		
		
			
		/*
		* 학생검색(번호,국어,영어,수학,학점,석차)
		*/

		/*
		* 번호3번인학생 1명찾아서 1명정보출력(학생번호는 중복되지않는다.)
		*/
		
		 System.out.println(">>번호 3번인학생 1명찾아서 1명정보출력(학생번호는 중복되지않는다.)\n");
		 for(int i=0;i<noArray.length;i++) {
			 if(noArray[i]==3) {
				 	System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d\n",
				 			noArray[i],nameArray[i],korArray[i],engArray[i],mathArray[i],totArray[i],avgArray[i],gradeArray[i],rankArray[i]);
				 	break;
			 }
		 }
		 System.out.println();

		
		
		
		/*
		* 국어점수 80점인 학생들 여러명 찾아서 여러명정보출력
		*/
			
		 
		 System.out.println(">>국어점수 80점인 학생들 여러명 찾아서 여러명정보출력\n");
		 for(int i=0;i<noArray.length;i++) {
			 if(korArray[i]==80) {
				 	System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d\n",
				 			noArray[i],nameArray[i],korArray[i],engArray[i],mathArray[i],totArray[i],avgArray[i],gradeArray[i],rankArray[i]);
				 	
			 }
		 }
		 System.out.println();
		 
		 
		/*
		* 영어점수 50점이하인 학생들 여러명 찾아서 여러명정보출력
		*/
		 
		 System.out.println(">>영어점수 50점이하인 학생들 여러명 찾아서 여러명정보출력\n");
		 for(int i=0;i<noArray.length;i++) {
			 if(engArray[i]<=50) {
				 	System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d\n",
				 			noArray[i],nameArray[i],korArray[i],engArray[i],mathArray[i],totArray[i],avgArray[i],gradeArray[i],rankArray[i]);
				 	
			 }
		 }
		 System.out.println();	
		 
		/*
		* 수학점수 70점이상인 학생들 여러명 찾아서 여러명정보출력
		*/
		
		 System.out.println(">>수학점수 70점이상인 학생들 여러명 찾아서 여러명정보출력\n");
		 for(int i=0;i<noArray.length;i++) {
			 if(mathArray[i]>=70) {
				 	System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d\n",
				 			noArray[i],nameArray[i],korArray[i],engArray[i],mathArray[i],totArray[i],avgArray[i],gradeArray[i],rankArray[i]);
				 	
			 }
		 }
		 System.out.println();	
		 
		/*
		* 학점이 D학점이하인 학생모두찾아서 여러명 정보출력
		*/		
		 
		 System.out.println(">>학점이 D학점이하인 학생모두찾아서 여러명 정보출력\n");
		 for(int i=0;i<noArray.length;i++) {
			 if(avgArray[i]<=70) {
				 	System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d\n",
				 			noArray[i],nameArray[i],korArray[i],engArray[i],mathArray[i],totArray[i],avgArray[i],gradeArray[i],rankArray[i]);
				 	
			 }
		 }
		 System.out.println();	
		
			
		
		
		 
		System.out.printf("-----------------학생성적출력(정렬전)-------------------\n");
		System.out.printf("%s %s %s %s %s %s %s %s %s\n","학번","이름","국어","영어","수학","총점","평균","평점","석차");
		System.out.printf("--------------------------------------------\n");
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%3d %4s %4d %4d %4d %4d %5.1f %3c %3d  \n",
					noArray[i],nameArray[i],korArray[i],engArray[i],mathArray[i],
					totArray[i],avgArray[i],gradeArray[i],rankArray[i]);
			
		}
		
		 /*
		 * 정렬
		 *    1.오름차순 
		 *      ex> 1,2,3,4,5....
		 *          a,b,c,d,e....,가 ... 힣
		 *    2.내림차순
		 *    	ex> 5,4,3,2,1
		 *          z,y,x.... , 힣  ... 가
		 */
		 
		 /*
		  학생총점(석차)순으로 오름차순
		  https://www.youtube.com/watch?v=ebI54DXYQG8
		*/
	
		 //1회
		 for(int j=0;j < noArray.length-1;j++) {
			 if(totArray[j] > totArray[j+1]) {
				 //tot 교체
				 int tempTot = totArray[j+1];
				 totArray[j+1]=totArray[j];
				 totArray[j]=tempTot;
				 //no교체
				 int tempNo=noArray[j+1];
				 noArray[j+1]=noArray[j];
				 noArray[j]=tempNo;
				 
				 //name교체
				 String tempName = nameArray[j+1];
				 nameArray[j+1]=nameArray[j];
				 nameArray[j]=tempName;
				 
				 //kor 교체
				 int tempKor = korArray[j+1];
				 korArray[j+1] = korArray[j];
				 korArray[j] = tempKor;
				 
				 //eng 교체
				 int tempEng = engArray[j+1];
				 engArray[j+1] = engArray[j];
				 engArray[j] = tempEng;
				 
				 //avg 교체
				 double tempAvg = avgArray[j+1];
				 avgArray[j+1] = avgArray[j];
				 avgArray[j] = tempAvg;
				 
				 //grade 교체
				 
				 char tempGrade = gradeArray[j+1];
				 gradeArray[j+1] = gradeArray[j];
				 gradeArray[j] = tempGrade;
				 
				 //rank 교체
				 int tempRank = rankArray[j+1];
				 rankArray[j+1] = rankArray[j];
				 rankArray[j] = tempRank;
				 
			 }
			
		 }
		 
		 
		 
		 
		 
		 
			System.out.printf("-----------------학생성적출력(정렬후)-------------------\n");
			System.out.printf("%s %s %s %s %s %s %s %s %s\n","학번","이름","국어","영어","수학","총점","평균","평점","석차");
			System.out.printf("--------------------------------------------\n");
			for (int i = 0; i < noArray.length; i++) {
				System.out.printf("%3d %4s %4d %4d %4d %4d %5.1f %3c %3d  \n",
						noArray[i],nameArray[i],korArray[i],engArray[i],mathArray[i],
						totArray[i],avgArray[i],gradeArray[i],rankArray[i]);
				
			}
		
					
			
	} //main end

} //class end
