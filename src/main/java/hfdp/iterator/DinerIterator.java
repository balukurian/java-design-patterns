package hfdp.iterator;

import java.util.Iterator;

public class DinerIterator implements Iterator<MenuItem> {

    MenuItem[] items;
    int position = 0;

    public DinerIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return this.position < this.items.length && items[this.position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[this.position];
        this.position = this.position + 1;
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException
                    ("You can’t remove an item until you’ve done at least one next()");
        }
        if (items[position - 1] != null) {
            if (items.length - 1 - position - 1 >= 0)
                System.arraycopy(items, position - 1 + 1, items, position - 1, items.length - 1 - position - 1);
            items[items.length - 1] = null;
        }
    }
}
