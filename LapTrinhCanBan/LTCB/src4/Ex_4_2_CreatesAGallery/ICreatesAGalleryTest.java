package Ex_4_2_CreatesAGallery;

import junit.framework.TestCase;

public class ICreatesAGalleryTest extends TestCase {
		public void testConstructor() {
			ICreatesAGallery c1 = new Text("Welcome.txt",5312,830);
			ICreatesAGallery c2 = new MP3("theme.mp3",40960,3,20);
			ICreatesAGallery c3 = new Images("flower.gif",57234,100,50,"medium");
		}
}
