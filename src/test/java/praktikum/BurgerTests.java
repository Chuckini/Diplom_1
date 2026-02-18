package praktikum;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class BurgerTests {

    private Burger burger;
    private Bun bun;
    private Ingredient sauce;
    private Ingredient filling;

    @Before
    public void setUp() {
        burger = new Burger();

        bun = Mockito.mock(Bun.class);
        Mockito.when(bun.getName()).thenReturn("white bun");
        Mockito.when(bun.getPrice()).thenReturn(200f);

        sauce = Mockito.mock(Ingredient.class);
        Mockito.when(sauce.getType()).thenReturn(IngredientType.SAUCE);
        Mockito.when(sauce.getName()).thenReturn("hot sauce");
        Mockito.when(sauce.getPrice()).thenReturn(100f);

        filling = Mockito.mock(Ingredient.class);
        Mockito.when(filling.getType()).thenReturn(IngredientType.FILLING);
        Mockito.when(filling.getName()).thenReturn("cutlet");
        Mockito.when(filling.getPrice()).thenReturn(300f);

        burger.setBuns(bun);
        burger.addIngredient(sauce);
        burger.addIngredient(filling);
    }

    @Test
    public void shouldSetBunsWithMock() {
        Bun newBun = Mockito.mock(Bun.class);

        burger.setBuns(newBun);

        assertSame(newBun, burger.bun);
    }

    @Test
    public void shouldAddIngredient_increasesIngredientsSize() {
        Burger emptyBurger = new Burger();
        Ingredient ingredient = Mockito.mock(Ingredient.class);

        emptyBurger.addIngredient(ingredient);

        assertEquals(1, emptyBurger.ingredients.size());
    }

    @Test
    public void shouldAddIngredient_addsIngredientToList() {
        Burger emptyBurger = new Burger();
        Ingredient ingredient = Mockito.mock(Ingredient.class);

        emptyBurger.addIngredient(ingredient);

        assertSame(ingredient, emptyBurger.ingredients.get(0));
    }

    @Test
    public void shouldRemoveIngredientByIndex_decreasesIngredientsSize() {
        Burger emptyBurger = new Burger();
        Ingredient firstIngredient = Mockito.mock(Ingredient.class);
        Ingredient secondIngredient = Mockito.mock(Ingredient.class);

        emptyBurger.addIngredient(firstIngredient);
        emptyBurger.addIngredient(secondIngredient);

        emptyBurger.removeIngredient(0);

        assertEquals(1, emptyBurger.ingredients.size());
    }

    @Test
    public void shouldRemoveIngredientByIndex_shiftsRemainingIngredient() {
        Burger emptyBurger = new Burger();
        Ingredient firstIngredient = Mockito.mock(Ingredient.class);
        Ingredient secondIngredient = Mockito.mock(Ingredient.class);

        emptyBurger.addIngredient(firstIngredient);
        emptyBurger.addIngredient(secondIngredient);

        emptyBurger.removeIngredient(0);

        assertSame(secondIngredient, emptyBurger.ingredients.get(0));
    }

    @Test
    public void shouldMoveIngredientWithMocks_changesOrder() {
        Burger emptyBurger = new Burger();

        Ingredient firstIngredient = Mockito.mock(Ingredient.class);
        Ingredient secondIngredient = Mockito.mock(Ingredient.class);
        Ingredient thirdIngredient = Mockito.mock(Ingredient.class);

        emptyBurger.addIngredient(firstIngredient);
        emptyBurger.addIngredient(secondIngredient);
        emptyBurger.addIngredient(thirdIngredient);

        emptyBurger.moveIngredient(0, 2);

        assertArrayEquals(
                new Ingredient[]{secondIngredient, thirdIngredient, firstIngredient},
                emptyBurger.ingredients.toArray(new Ingredient[0])
        );
    }

    @Test
    public void shouldContainBunHeaderAndFooterInReceipt() {
        String receipt = burger.getReceipt();
        assertTrue(receipt.contains("(==== white bun ====)"));
    }

    @Test
    public void shouldContainSauceLineInReceipt() {
        String receipt = burger.getReceipt();
        assertTrue(receipt.contains("= sauce hot sauce ="));
    }

    @Test
    public void shouldContainFillingLineInReceipt() {
        String receipt = burger.getReceipt();
        assertTrue(receipt.contains("= filling cutlet ="));
    }

    @Test
    public void shouldContainCorrectPriceLineInReceipt() {
        String receipt = burger.getReceipt();
        float expected = 200f * 2 + 100f + 300f;
        assertTrue(receipt.contains(String.format("Price: %f", expected)));
    }

    @Test
    public void shouldCallBunGetNameWhenBuildingReceipt() {
        burger.getReceipt();
        Mockito.verify(bun, Mockito.atLeastOnce()).getName();
    }

    @Test
    public void shouldCallBunGetPriceWhenBuildingReceipt() {
        burger.getReceipt();
        Mockito.verify(bun, Mockito.atLeastOnce()).getPrice();
    }

    @Test
    public void shouldCallSauceGetTypeWhenBuildingReceipt() {
        burger.getReceipt();
        Mockito.verify(sauce, Mockito.atLeastOnce()).getType();
    }

    @Test
    public void shouldCallSauceGetNameWhenBuildingReceipt() {
        burger.getReceipt();
        Mockito.verify(sauce, Mockito.atLeastOnce()).getName();
    }

    @Test
    public void shouldCallFillingGetTypeWhenBuildingReceipt() {
        burger.getReceipt();
        Mockito.verify(filling, Mockito.atLeastOnce()).getType();
    }

    @Test
    public void shouldCallFillingGetNameWhenBuildingReceipt() {
        burger.getReceipt();
        Mockito.verify(filling, Mockito.atLeastOnce()).getName();
    }
}
