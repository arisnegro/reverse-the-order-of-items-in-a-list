package arisnegro.com.es.util.list.reverselist;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest  {

	private static List<Integer> source;
	private static List<Integer> inverse;
	
	@BeforeClass
	public static void initialization() {
		
        source = new ArrayList<>();
        source.add(1);
        source.add(2);
        source.add(3);
        source.add(4);
        
        inverse = new ArrayList<>();
        inverse.add(4);
        inverse.add(3);
        inverse.add(2);
        inverse.add(1);
	}

	@Test
    public void testManualReverse() {
        App           app;
        List<Integer> current;
        List<Integer> expected;
    	
        app      = new App();
        current  = app.manualReverse(source);
        expected = inverse;
    	assertEquals("The list must be in inverse order", expected, current);
    }

	@Test
    public void testManualReverseNullSource() {
        App           app;
        List<Integer> current;
        List<Integer> expected;
    	
        app      = new App();
        current  = app.manualReverse(null);
        expected = null;
    	assertEquals("The list must be in inverse order", expected, current);
    }

	@Test
    public void testManualReverseEmptySource() {
        App           app;
        List<Integer> current;
        List<Integer> expected;
    	
        app      = new App();
        current  = app.manualReverse(new ArrayList<>());
        expected = new ArrayList<>();
    	assertEquals("The list must be in inverse order", expected, current);
    }

	@Test
    public void testForwardIteratorReverse() {
        App           app;
        List<Integer> current;
        List<Integer> expected;
    	
        app      = new App();
        current  = app.forwardIteratorReverse(source);
        expected = inverse;
    	assertEquals("The list must be in inverse order", expected, current);
    }
	
	@Test
    public void testForwardIteratorNullSource() {
        App           app;
        List<Integer> current;
        List<Integer> expected;
    	
        app      = new App();
        current  = app.forwardIteratorReverse(null);
        expected = null;
    	assertEquals("The list must be in inverse order", expected, current);
    }

	@Test
    public void testForwardIteratorEmptySource() {
        App           app;
        List<Integer> current;
        List<Integer> expected;
    	
        app      = new App();
        current  = app.forwardIteratorReverse(new ArrayList<>());
        expected = new ArrayList<>();
    	assertEquals("The list must be in inverse order", expected, current);
    }
	
	@Test
    public void testBackwardIteratorReverse() {
        App           app;
        List<Integer> current;
        List<Integer> expected;
    	
        app      = new App();
        current  = app.backwardIteratorReverse(source);
        expected = inverse;
    	assertEquals("The list must be in inverse order", expected, current);
    }
	
	@Test
    public void testBackwardIteratorNullSource() {
        App           app;
        List<Integer> current;
        List<Integer> expected;
    	
        app      = new App();
        current  = app.backwardIteratorReverse(null);
        expected = null;
    	assertEquals("The list must be in inverse order", expected, current);
    }

	@Test
    public void testBackwardIteratorEmptySource() {
        App           app;
        List<Integer> current;
        List<Integer> expected;
    	
        app      = new App();
        current  = app.backwardIteratorReverse(new ArrayList<>());
        expected = new ArrayList<>();
    	assertEquals("The list must be in inverse order", expected, current);
    }
	
	@Test
    public void testStreamReverse() {
        App           app;
        List<Integer> current;
        List<Integer> expected;
    	
        app      = new App();
        current  = app.streamReverse(source);
        expected = inverse;
    	assertEquals("The list must be in inverse order", expected, current);
    }
	
	@Test
    public void testStreamNullSource() {
        App           app;
        List<Integer> current;
        List<Integer> expected;
    	
        app      = new App();
        current  = app.streamReverse(null);
        expected = null;
    	assertEquals("The list must be in inverse order", expected, current);
    }

	@Test
    public void testStreamEmptySource() {
        App           app;
        List<Integer> current;
        List<Integer> expected;
    	
        app      = new App();
        current  = app.streamReverse(new ArrayList<>());
        expected = new ArrayList<>();
    	assertEquals("The list must be in inverse order", expected, current);
    }
	
	@Test
    public void testCollectionsReverse() {
        App           app;
        List<Integer> current;
        List<Integer> expected;
    	
        app      = new App();
        current  = app.collectionsReverse(source);
        expected = inverse;
    	assertEquals("The list must be in inverse order", expected, current);
    }
	
	@Test
    public void testCollectionsNullSource() {
        App           app;
        List<Integer> current;
        List<Integer> expected;
    	
        app      = new App();
        current  = app.collectionsReverse(null);
        expected = null;
    	assertEquals("The list must be in inverse order", expected, current);
    }

	@Test
    public void testCollectionsEmptySource() {
        App           app;
        List<Integer> current;
        List<Integer> expected;
    	
        app      = new App();
        current  = app.collectionsReverse(new ArrayList<>());
        expected = new ArrayList<>();
    	assertEquals("The list must be in inverse order", expected, current);
    }
}