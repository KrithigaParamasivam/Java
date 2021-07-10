import javax.swing.*;
import javax.swing.tree.*;

class SwingJtree extends JFrame {
    JTree tree;
    DefaultMutableTreeNode root, parent1, parent2, child,child1, child2,child3;

    SwingJtree() {
        super("JTree Demo");

        root = new DefaultMutableTreeNode("States");
        parent1 = new DefaultMutableTreeNode("Andhra Pradesh");
        child = new DefaultMutableTreeNode("Vijayawada");
        child1 = new DefaultMutableTreeNode("Vizag");
        parent2 = new DefaultMutableTreeNode("Tamilnadu");
        child2 = new DefaultMutableTreeNode("chennai");
        child3 = new DefaultMutableTreeNode("Trichy");




        parent1.add(child);
        parent1.add(child1);
        parent2.add(child2);
        parent2.add(child3);


        root.add(parent1);
        root.add(parent2);


        tree = new JTree(root);

        getContentPane().add(new JScrollPane(tree));
        setSize(300, 300);
        setVisible(true);
    }
}

class JTreeDemo {
    public static void main(String args[]) throws Exception {
        UIManager
                .setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        new SwingJtree();
    }
}