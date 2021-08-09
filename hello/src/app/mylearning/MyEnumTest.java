package app.mylearning;


public class MyEnumTest {
	public enum Rainbow {RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO , VIOLET

	}
	public static void main(String[] args)
	{
		System.out.println(Rainbow.values());
		System.out.println(Rainbow.valueOf("ORANGE"));
		System.out.println(Rainbow.valueOf("INDIGO").ordinal());
	}

	}


