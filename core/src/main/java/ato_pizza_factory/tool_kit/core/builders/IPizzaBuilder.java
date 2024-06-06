package ato_pizza_factory.tool_kit.core.builders;

import ato_pizza_factory.tool_kit.core.models.components.DoughShape;
import ato_pizza_factory.tool_kit.core.models.Pizza;

public interface IPizzaBuilder {
    Pizza buildPlainPizza(DoughShape doughShape);
}
