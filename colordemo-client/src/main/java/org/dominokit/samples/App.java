package org.dominokit.samples;

import com.google.gwt.core.client.EntryPoint;
import org.dominokit.domino.ui.Typography.Paragraph;
import org.dominokit.domino.ui.cards.Card;
import org.dominokit.domino.ui.icons.Icons;
import org.dominokit.domino.ui.layout.Layout;
import org.dominokit.domino.ui.style.ColorScheme;
import org.dominokit.domino.ui.tree.Tree;
import org.dominokit.domino.ui.tree.TreeItem;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class App implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        Layout layout = Layout.create("Domino-ui starter")
                .show(AppColorScheme.CUSTOM_RED);

        layout.getLeftPanel()
                .appendChild(Tree.create("Menu")
                        .appendChild(TreeItem.create("Menu 1", Icons.ALL.widgets()))
                        .appendChild(TreeItem.create("Menu 2", Icons.ALL.widgets()))
                        .addItemClickListener(treeItem -> {
                            layout.setContent(Card.create(treeItem.getValue())
                                    .setBackground(AppColor.CUSTOM_RED)
                                    .appendChild(Paragraph.create("Welcome to domino-ui , you are viewing "+treeItem.getValue()+" content")));
                        })
                );
    }
}
