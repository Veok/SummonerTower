package domain.model.guide;

import java.util.List;

/**
 * @author: Lelental on 07.02.2017
 */
public interface IHaveItem {

    List<Item> startItems();

    List<Item> middleItems();

    List<Item> finalItems();
}
