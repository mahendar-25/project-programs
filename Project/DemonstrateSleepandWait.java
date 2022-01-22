package assitedproject;

public class DemonstrateSleepandWait {
	private static Object LOCK = new Object();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 1 seconds");
        synchronized (LOCK) {
            try {
				LOCK.wait(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println("Object '" + LOCK + "' is woken after" + " waiting for 1 seconds");

   }
    


	}

}
