import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Nasim Salmany
 */
public class GridTest {

    @Test
    public void grid_should_have_init_dead_cells() {
        GameOfLife gameOfLife = new GameOfLife();
        Grid grid = GameOfLife.startGame();

        assertThat(grid.getCells(), notNullValue());
        assertThat(grid.getCells().stream()
                .filter(c -> c.getStatus() == Status.ALIVE)
                .count(), equalTo(0L));
    }

}