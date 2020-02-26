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
            Shape theCirkle = new Cirkle((int) 5.5);
            //When
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(theCirkle);
            //Then
            Assert.assertEquals(1, shapeCollector.addFigure((Shape) theCirkle));
        }
        @Test
        public void testCaseRemoveFigure() {
            //Given
            Shape theSquare = new Square(18);
            //When
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(theSquare);
            int result = shapeCollector.removeFigure(theSquare);
            //then
           // Assert.assertTrue(result);
            Assert.assertEquals(0,result);
        }
        @Test
        public void testCaseGetFigure() {
            //Given
            Shape figure = new Shape( ) {
                @Override
                public String getShapeName() {
                    return "Cirkle";
                }

                @Override
                public int getField() {
                    return 20;
                }
            };
            //When
            int field = figure.getField();
            //Then
            Assert.assertEquals(20, field);
        }
        @Test
        public void testCaseShowFigure() {
            //Given
            Shape figure = new Shape( ) {
                @Override
                public String getShapeName() {
                    return "Cirkle";
                }

                @Override
                public int getField() {
                    return 20;
                }
            };
            //then
            String result = figure.getShapeName();
            // then
            Assert.assertEquals("Cirkle", result);
        }
    }

