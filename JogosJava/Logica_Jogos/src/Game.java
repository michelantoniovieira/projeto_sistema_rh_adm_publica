
public class Game implements Runnable
{
	private boolean isRunning;
	private Thread thread;

	public static void main(String[] args)
	{
		Game game = new Game();
		game.start();
	}

	public synchronized void start()
	{
		isRunning = true;
		thread = new Thread();
		thread.start();
	}

	public void tick()
	{
		System.out.println("Tick");
	}

	public void render()
	{
		System.out.println("Render");
	}

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		while (isRunning)
		{
			tick();
			render();
		}
	}
}
