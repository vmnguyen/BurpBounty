package burpbounty;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class SmartScanGUI {

    public static javax.swing.JComponent makeTextPanel(String text) {
        javax.swing.JPanel panel = new javax.swing.JPanel(false);
        javax.swing.JLabel filler = new javax.swing.JLabel(text);
        filler.setHorizontalAlignment(javax.swing.JLabel.CENTER);
        panel.setLayout(new java.awt.GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }

    public static javax.swing.JComponent makeTable(){
        //Table logTable = new Table(BurpExtender.this);
        return null;
    }

    public static JSplitPane createDashboard(){
        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        //Table logTable = new Table(BurpExtender.this);
        

        String[] columnNames = {"#",
                        "URL",
                        "Rule Match",
                        "Profile/Tag Launch"};
        
        Object[][] data = {
            {"1", "https://google.com", "testing", "SQL Inject"}
                        };

        JTable table = new JTable(data, columnNames);

        JScrollPane scrollPane = new JScrollPane(table);
        splitPane.setLeftComponent(scrollPane);
        return splitPane;
        
    }

    public static JSplitPane createRulePane(){
        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        //Table logTable = new Table(BurpExtender.this);
        

        String[] columnNames = {"#",
                        "URL",
                        "Rule Match",
                        "Profile/Tag Launch"};
        
        Object[][] data = {
            {"1", "https://google.com", "testing", "SQL Inject"}
                        };

        JTable table = new JTable(data, columnNames);

        JScrollPane scrollPane = new JScrollPane(table);
        splitPane.setLeftComponent(scrollPane);
        return splitPane;
        
    }


    private class Table extends JTable
    {
        public Table(TableModel tableModel)
        {
            super(tableModel);
        }
        
        @Override
        public void changeSelection(int row, int col, boolean toggle, boolean extend)
        {
            // show the log entry for the selected row
            /*
            LogEntry logEntry = log.get(row);
            requestViewer.setMessage(logEntry.requestResponse.getRequest(), true);
            responseViewer.setMessage(logEntry.requestResponse.getResponse(), false);
            currentlyDisplayedItem = logEntry.requestResponse;
            */
            super.changeSelection(row, col, toggle, extend);
        }        
    }

}