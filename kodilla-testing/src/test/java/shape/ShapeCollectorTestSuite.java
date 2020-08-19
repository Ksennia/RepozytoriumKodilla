package shape;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShapeCollectorTestSuite {

        @BeforeEach
        public void before() {
            System.out.println("Test Case: begin");
        }

        @AfterEach
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
            assertEquals(1, shapeCollector.shapeList.size());
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
            assertTrue(result);
            assertEquals(1,shapeCollector.shapeList.size());
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
            assertEquals(result, square);
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

