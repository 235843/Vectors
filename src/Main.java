
class Main {
	public static void main(String[] wsp) throws Exception
	{
		VectorClass v = new VectorClass();
		while (true)
		{
			System.out.println("Podaj dwa wektory :");
			v.readTwoVectors();
			if(v.vec1.size()!=v.vec2.size())
			try {
				throw new WektoryRoznejDlugosciException(v.vec1.size(), v.vec2.size());
			}catch (WektoryRoznejDlugosciException e)
			{
				v.vec1.clear();
				v.vec2.clear();
				continue;
			}
			break;
		}

		v.addVectors();
		System.out.println("Dodany wektor : " + v.resVec);
		VectorSaver file = new VectorSaver();
		file.SaveVector(v.resVec);
		System.out.println("Został zapisany do pliku");

	}
}
