package Master;

public class Time implements Runnable{
	
	
	public static void main(String[] args) {
	
	
	}

	@Override
	public void run() {
		int xiaoshi = 0;
		 
		 int fen = 0;
		 
		 int miao = 0;
		 
		 for (int i = 0; xiaoshi <= 24; i++) {
			
			miao++;
			 
			 if(miao == 59) {
				 miao = 0;
				 fen++;
			 }
			 
			
			 if(fen == 59) {
				 fen = 0;
				 xiaoshi++;
			 }
			 
			 System.out.println("现在是" + xiaoshi + "时" + fen + "分" + miao + "秒");
			 Thread t = new Thread();
			 try {
				t.sleep(60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

}
