public class Ex4_19 
{
		public static void main(String[] args)
		{
	      // for문에 Loop1이라는 이름을 붙였다.
			Loop1 : for(int i=2;i <=9;i++) {	
					for(int j=1;j <=9;j++) {
						if(j==5)
							break Loop1; // Loop1을 빠져나가 바로 출력
//							break; // Loop1을 빠져나가지않음
//							continue Loop1; // 잘 안쓴다. (몰라도 됨)
//							continue;
						System.out.println(i+"*"+ j +"="+ i*j);
					} // end of for i
					System.out.println();
			} // end of Loop1

		}
	}