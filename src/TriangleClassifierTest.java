import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassifierTest {

    @Test
    @DisplayName("Test classifyEquilateralTriangle")
    public void testClassifyEquilateralTriangle(){
        assertEquals("Equilateral", TriangleClassifier.classifyTriangle(2, 2, 2));
    }

    @Test
    @DisplayName("Test testClassifyIsoscelesTriangle")
    public void testClassifyIsoscelesTriangle(){
        assertEquals("Isosceles", TriangleClassifier.classifyTriangle(2, 2, 3));
    }

    @Test
    @DisplayName("Test testClassifyScaleneTriangle")
    public void testClassifyScaleneTriangle(){
        assertEquals("Scalene", TriangleClassifier.classifyTriangle(3, 4, 5));
    }

    @Test
    @DisplayName("Test testClassifyInvalidTriangle")
    public void testClassifyInvalidTriangle(){
        assertEquals("Invalid", TriangleClassifier.classifyTriangle(8, 2, 3));
        assertEquals("Invalid", TriangleClassifier.classifyTriangle(-1, 2, 1));
        assertEquals("Invalid", TriangleClassifier.classifyTriangle(0, 1, 1));
    }

}