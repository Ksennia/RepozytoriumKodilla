package shape;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShapeCollectorTestSuite {

        @Before
        public void before() {
            System.out.println("Test Case: begin");
        }

        @After
        public void after() {
            System.out.println("Test Case: end");
        }

        @Test
        public void testCaseAddFigure() {
            //Given
            Shape cirkle = new Cirkle();

            //When
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(cirkle);

            //Then
            Assert.assertEquals(1, shapeCollector.shapeList.size());
        }
        @Test
        public void testCaseRemoveFigure() {
            //Given
            Shape square = new Square();
            Shape triangle = new Triangle();

            //When
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);
            boolean result = shapeCollector.removeFigure(square);

            //then
            Assert.assertTrue(result);
            Assert.assertEquals(1,shapeCollector.shapeList.size());
        }
        @Test
        public void testCaseGetFigure() {
            //Given
            Shape cirkle = new Cirkle();
            Shape triangle = new Triangle();
            Shape square = new Square();
            //When
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(cirkle);
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(square);
            Shape result = shapeCollector.getFigure(2);
            //Then
            Assert.assertEquals(result, square);
        }
        @Test
        public void testCaseShowFigure() {
            //Given
            Shape shape = new Triangle();

            //When
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(shape);
            shapeCollector.showFigure();

            // then

        }
    }

