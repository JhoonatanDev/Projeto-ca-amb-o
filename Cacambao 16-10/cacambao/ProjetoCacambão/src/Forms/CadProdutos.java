/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Forms;

import Classes.ClasseCacamba;
import Classes.ClasseContainer;
import Classes.model.Cacamba;
import Classes.model.Containers;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 888872
 */
public final class CadProdutos extends javax.swing.JDialog {

    /**
     * Creates new form CadProdutos
     */
    
    public void listarCacamba() {

        ClasseCacamba dao = new ClasseCacamba();
        List<Cacamba> lista = dao.listarCacamba();
        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
        dados.setNumRows(0);
        
        for (Cacamba c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getDescricao(),
                c.getPreco_unitario(),
                c.getTamanho(),
                c.getDisponibilidade(),
                c.getObs()

            });

        }

    }
    
   public void listarCacambaPorCodigo(int cod) {
    ClasseCacamba dao = new ClasseCacamba();
    Cacamba cacamba = dao.buscaPorCodigo(cod); // Obtém uma única instância de Cacamba

    if (cacamba != null) { // Verifica se a instância não é nula
        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
        dados.setNumRows(0);

        // Adiciona os dados da instância de Cacamba à tabela
        Object[] row = new Object[]{
            cacamba.getId(),
            cacamba.getDescricao(),
            cacamba.getPreco_unitario(),
            cacamba.getTamanho(),
            cacamba.getDisponibilidade(),
            cacamba.getObs()
        };
        dados.addRow(row);
    } else {
        // Trate o caso em que nenhum Cacamba foi encontrado com o código especificado
        JOptionPane.showMessageDialog(null, "Cacamba não encontrada!");
        txtPesquisa.requestFocus();
    }
}
   
   public void listarCacambaPorDescricao(String descricao) {
    ClasseCacamba dao = new ClasseCacamba();
    List<Cacamba> lista = dao.buscaPorDescricao(descricao);
    DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
    dados.setNumRows(0);

    for (Cacamba c : lista) {
        dados.addRow(new Object[]{
            c.getId(),
            c.getDescricao(),
            c.getPreco_unitario(),
            c.getTamanho(),
            c.getDisponibilidade(),
            c.getObs()
        });
    }
} 
   
   public void listarCacambaPorTamanho(String tamanho) {
    ClasseCacamba dao = new ClasseCacamba();
    List<Cacamba> lista = dao.buscaPorTamanho(tamanho);
    DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
    dados.setNumRows(0);

    for (Cacamba c : lista) {
        dados.addRow(new Object[]{
            c.getId(),
            c.getDescricao(),
            c.getPreco_unitario(),
            c.getTamanho(),
            c.getDisponibilidade(),
            c.getObs()
        });
    }
}
   
   public void listarCacambaPorDisponibilidade(String Disponibilidade) {
    ClasseCacamba dao = new ClasseCacamba();
    List<Cacamba> lista = dao.buscaPorDisponibilidade(Disponibilidade);
    DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
    dados.setNumRows(0);

    for (Cacamba c : lista) {
        dados.addRow(new Object[]{
            c.getId(),
            c.getDescricao(),
            c.getPreco_unitario(),
            c.getTamanho(),
            c.getDisponibilidade(),
            c.getObs()
        });
    }
}
   
   
    
    public void listarContainer() {

        ClasseContainer dao = new ClasseContainer();
        List<Containers> lista = dao.listarContainer();
        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
        dados.setNumRows(0);

        for (Containers c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getDescricao(),
                c.getPreco_unitario(),
                c.getTamanho(),
                c.getDisponibilidade(),
                c.getObs()

            });

        }

    }
    
    public void listarContainerPorCodigo(int cod) {
    ClasseContainer dao = new ClasseContainer();
    Containers container = dao.buscaPorCodigo(cod); // Obtém uma única instância de Container

    if (container != null) { // Verifica se a instância não é nula
        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
        dados.setNumRows(0);

        // Adiciona os dados da instância de Container à tabela
        Object[] row = new Object[]{
            container.getId(),
            container.getDescricao(),
            container.getPreco_unitario(),
            container.getTamanho(),
            container.getDisponibilidade(),
            container.getObs()
        };
        dados.addRow(row);
    /*} else {
        // Trate o caso em que nenhum Cacamba foi encontrado com o código especificado
        JOptionPane.showMessageDialog(null, "Cacamba não encontrada!");*/
    }    
    
}
    
   public void listarContainerPorDescricao(String descricao) {
    ClasseContainer dao = new ClasseContainer();
    List<Containers> lista = dao.buscaPorDescricao(descricao);
    DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();    
    dados.setNumRows(0);

    for (Containers c : lista) {
        dados.addRow(new Object[]{
            c.getId(),
            c.getDescricao(),
            c.getPreco_unitario(),
            c.getTamanho(),
            c.getDisponibilidade(),
            c.getObs()
        });
    }
}
   
   public void listarContainerPorTamanho(String tamanho) {
    ClasseContainer dao = new ClasseContainer();
    List<Containers> lista = dao.buscaPorTamanho(tamanho);
    DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
    dados.setNumRows(0);

    for (Containers c : lista) {
        dados.addRow(new Object[]{
            c.getId(),
            c.getDescricao(),
            c.getPreco_unitario(),
            c.getTamanho(),
            c.getDisponibilidade(),
            c.getObs()
        });
    }
}
   
   public void listarContainerPorDisponibilidade(String Disponibilidade) {
    ClasseContainer dao = new ClasseContainer();
    List<Containers> lista = dao.buscaPorDisponibilidade(Disponibilidade);
    DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
    dados.setNumRows(0);

    for (Containers c : lista) {
        dados.addRow(new Object[]{
            c.getId(),
            c.getDescricao(),
            c.getPreco_unitario(),
            c.getTamanho(),
            c.getDisponibilidade(),
            c.getObs()
        });
    }
}
   
   
    
    public CadProdutos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tema();
        desabilitaCampos();
        txtPesquisa.requestFocus();
        btnCancelar.setEnabled(false);
        
        
    }
    
    public CadProdutos() {
        initComponents();
        tema();
        desabilitaCampos();
        txtPesquisa.requestFocus();
        btnCancelar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_abas = new javax.swing.JTabbedPane();
        painel_consuta = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cbTipoConsulta = new javax.swing.JComboBox<>();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        cbTipoProdutoPesquisa = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        painel_cadastro = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        cbDisponibilidade = new javax.swing.JComboBox<>();
        cbTamanho = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtpreco = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtobs = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSalvaEdicao = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de produtos");

        panel_abas.setBackground(new java.awt.Color(255, 255, 255));

        painel_consuta.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Consultar por:");

        cbTipoConsulta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbTipoConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Código", "Descrição", "Tamanho", "Disponibilidade" }));

        txtPesquisa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnPesquisa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnPesquisa.setText("Pesquisar");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição", "Preço", "Tamanho", "Disponibilidade", "OBS"
            }
        ));
        tabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelaProdutosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProdutos);

        cbTipoProdutoPesquisa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbTipoProdutoPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Caçamba", "Container" }));
        cbTipoProdutoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoProdutoPesquisaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Tipo de produto:");

        javax.swing.GroupLayout painel_consutaLayout = new javax.swing.GroupLayout(painel_consuta);
        painel_consuta.setLayout(painel_consutaLayout);
        painel_consutaLayout.setHorizontalGroup(
            painel_consutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_consutaLayout.createSequentialGroup()
                .addGroup(painel_consutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_consutaLayout.createSequentialGroup()
                        .addGroup(painel_consutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painel_consutaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel_consutaLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(painel_consutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painel_consutaLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbTipoProdutoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painel_consutaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painel_consutaLayout.setVerticalGroup(
            painel_consutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_consutaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(painel_consutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipoProdutoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(painel_consutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        panel_abas.addTab("Consulta", painel_consuta);

        painel_cadastro.setBackground(new java.awt.Color(255, 255, 255));
        painel_cadastro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Preço Unitário:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Tamanho:");

        txtDescricao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDescricao.setEnabled(false);
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        cbDisponibilidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbDisponibilidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "D", "I" }));
        cbDisponibilidade.setEnabled(false);

        cbTamanho.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "G", "M", "P", "U" }));
        cbTamanho.setEnabled(false);
        cbTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTamanhoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Disponibilidade:");

        cbTipo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Caçamba", "Container" }));
        cbTipo.setEnabled(false);
        cbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTipoItemStateChanged(evt);
            }
        });
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Tipo de produto:");

        try {
            txtpreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtpreco.setEnabled(false);
        txtpreco.setPreferredSize(new java.awt.Dimension(5, 23));

        txtobs.setColumns(20);
        txtobs.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtobs.setRows(5);
        txtobs.setToolTipText("");
        txtobs.setEnabled(false);
        jScrollPane2.setViewportView(txtobs);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("OBS:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Descrição:");

        btnSalvaEdicao.setText("OK");
        btnSalvaEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvaEdicaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_cadastroLayout = new javax.swing.GroupLayout(painel_cadastro);
        painel_cadastro.setLayout(painel_cadastroLayout);
        painel_cadastroLayout.setHorizontalGroup(
            painel_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_cadastroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvaEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(painel_cadastroLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(painel_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_cadastroLayout.createSequentialGroup()
                        .addGroup(painel_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDescricao)
                            .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addGroup(painel_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painel_cadastroLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painel_cadastroLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbDisponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))
                    .addGroup(painel_cadastroLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        painel_cadastroLayout.setVerticalGroup(
            painel_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_cadastroLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(painel_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_cadastroLayout.createSequentialGroup()
                        .addGroup(painel_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(painel_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(painel_cadastroLayout.createSequentialGroup()
                        .addGroup(painel_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painel_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbDisponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(painel_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(7, 7, 7)
                .addComponent(btnSalvaEdicao)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panel_abas.addTab("Manutenção", painel_cadastro);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de Produtos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(688, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        btnSalvar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnNovo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnNovo.setText("Novo +");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnExcluirMouseReleased(evt);
            }
        });
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_abas, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_abas, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("Cadastro de produtos");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        // TODO add your handling code here:
        
         ListarCadastros();    
         limpaCampos();
         
        
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        //Metodo para cadastrar caçambas e containers        
        validarTipoTamanho();
        CadastrarProdutos();    
        panel_abas.setEnabledAt(0, true);
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o cadastro?", "Atenção", JOptionPane.YES_NO_OPTION);
        if(confirma == JOptionPane.YES_OPTION){
                   
            String tipoSelecionado = (String) cbTipo.getSelectedItem();

            if("Caçamba".equals(tipoSelecionado)){
                Cacamba obj = new Cacamba();
                int selectedRow = tabelaProdutos.getSelectedRow();
                obj.setId(Integer.parseInt(tabelaProdutos.getValueAt(selectedRow, 0).toString()));

                ClasseCacamba objc = new ClasseCacamba();
                objc.excluiCacamba(obj);

            } else if("Container".equals(tipoSelecionado)){
                Containers obj = new Containers();
                int selectedRow = tabelaProdutos.getSelectedRow();
                obj.setId(Integer.parseInt(tabelaProdutos.getValueAt(selectedRow, 0).toString()));

                ClasseContainer objc = new ClasseContainer();
                objc.excluiContainer(obj);
            }
            btnExcluir.setEnabled(false);
            limpaCampos();
            desabilitaCampos();
            panel_abas.setEnabledAt(0, true);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tabelaProdutosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosMouseReleased
        //Ao clicar em uma linha da tabela é direcionado a outra aba com os dados cadastrais setados nos JTextfields
        
        tabelaProdutos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {                  
               
              if (!e.getValueIsAdjusting() && tabelaProdutos.getSelectedRow() != -1) {
                int selectedRow = tabelaProdutos.getSelectedRow();
              
                if (selectedRow >= 0) {
                    
                    txtDescricao.setText((String) tabelaProdutos.getValueAt(selectedRow, 1));
                    txtpreco.setText(tabelaProdutos.getValueAt(selectedRow, 2).toString());
                    cbTamanho.setSelectedItem(tabelaProdutos.getValueAt(selectedRow, 3).toString());
                    cbDisponibilidade.setSelectedItem(tabelaProdutos.getValueAt(selectedRow, 4).toString());
                    txtobs.setText((String) tabelaProdutos.getValueAt(selectedRow, 5));  
                    desabilitaCampos();

                    //Setar o tipo de produto certo ao cadastro
                    String tamanhoselecionado = (String) cbTamanho.getSelectedItem();    

                    if("U".equals(tamanhoselecionado)){
                        cbTipo.setSelectedItem("Container");
                    }else if (!"U".equals(tamanhoselecionado)){
                        cbTipo.setSelectedItem("Caçamba");
                    }else if("Selecione".equals(tamanhoselecionado)){
                        
                    }                   
                    
                    btnExcluir.setEnabled(true);
                    btnEditar.setEnabled(true);
                    panel_abas.setSelectedComponent(painel_cadastro);
                }else{                                       
                    JOptionPane.showMessageDialog(null,"O indice 'selectedRow' é menor que zero" + selectedRow);
                }
              }
            }
       });
                   
                    

    }//GEN-LAST:event_tabelaProdutosMouseReleased

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        habilitaCampos();
        btnNovo.setEnabled(false);
        panel_abas.setSelectedComponent(painel_cadastro);
        limpaCampos();
        btnSalvar.setEnabled(true);
        btnSalvaEdicao.setEnabled(false);
        txtDescricao.requestFocus();
        panel_abas.setEnabledAt(0, false);
        
        /*
        LockedTabbedPane tabbedPane = new LockedTabbedPane();
        tabbedPane.lockTab(1);*/
               
        
       
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here: 
        habilitaCampos();
        btnSalvaEdicao.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnNovo.setEnabled(false);
        btnExcluir.setEnabled(false);
        panel_abas.setEnabledAt(0, false);
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvaEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvaEdicaoActionPerformed
        // ALTERAR O CADASTRO
        AlterarCadastros();
        btnEditar.setEnabled(false);
        panel_abas.setEnabledAt(0, true);
        
        
    }//GEN-LAST:event_btnSalvaEdicaoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        desabilitaCampos();
        limpaCampos();
        panel_abas.setEnabledAt(0, true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
           
                             
        
           String tiposelecionado = (String) cbTipo.getSelectedItem();

            if("Container".equals(tiposelecionado)){
                
                cbTamanho.setSelectedItem("U");
                //cbTamanho.setEnabled(false);
            }
                
    }//GEN-LAST:event_cbTipoActionPerformed

    private void cbTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTamanhoActionPerformed
        String tamanhoselecionado = (String) cbTamanho.getSelectedItem();
        
        if("U".equals(tamanhoselecionado)){
            cbTipo.setSelectedItem("Container");
        }
        
        
    }//GEN-LAST:event_cbTamanhoActionPerformed

   
    private void btnExcluirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnExcluirMouseReleased

    private void cbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTipoItemStateChanged
        // TODO add your handling code here:
         //
    }//GEN-LAST:event_cbTipoItemStateChanged

    private void cbTipoProdutoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoProdutoPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoProdutoPesquisaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadProdutos dialog = new CadProdutos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnSalvaEdicao;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbDisponibilidade;
    private javax.swing.JComboBox<String> cbTamanho;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JComboBox<String> cbTipoConsulta;
    private javax.swing.JComboBox<String> cbTipoProdutoPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel painel_cadastro;
    private javax.swing.JPanel painel_consuta;
    public javax.swing.JTabbedPane panel_abas;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextArea txtobs;
    private javax.swing.JFormattedTextField txtpreco;
    // End of variables declaration//GEN-END:variables

    
    
    
    //MÉTODOS DE BOTÕES PARA FUNÇÕES DO SISTEMA    +-
    
    public void CadastrarProdutos(){
        String tipoSelecionado = (String) cbTipo.getSelectedItem();
        String tamanhoSelecionado = (String) cbTamanho.getSelectedItem();                           
            
        if("Selecione".equals(tipoSelecionado)){
            JOptionPane.showMessageDialog(null, "Selecione o tipo do produto");
        } 
        
        else if ("Selecione".equals(tamanhoSelecionado)){
            JOptionPane.showMessageDialog(null, "Selecione o tamanho do produto");
        }
        
        
        
        else if(txtDescricao.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Insira uma descrição para o produto!");
        }
        
        else if(txtpreco.getText().equals("   .  ")){
            JOptionPane.showMessageDialog(null, "Preço não pode ser vazio!");
        }
        
        else if ("Caçamba".equals(tipoSelecionado)){            
            
            Cacamba obj = new Cacamba();
            obj.setTamanho((String) cbTamanho.getSelectedItem());
            obj.setPreco_unitario(Double.parseDouble( txtpreco.getText()));
            obj.setDescricao(txtDescricao.getText());
            obj.setDisponibilidade((String) cbDisponibilidade.getSelectedItem());   
            obj.setObs(txtobs.getText());
                        
            ClasseCacamba objcac = new ClasseCacamba();
            objcac.cadastrarCacamba(obj);
                        
            limpaCampos();
            desabilitaCampos();
            listarCacamba();
            
        }else if ("Container".equals(tipoSelecionado)){
            Containers obj = new Containers();
            obj.setTamanho((String) cbTamanho.getSelectedItem());
            obj.setPreco_unitario(Double.parseDouble( txtpreco.getText()));
            obj.setDescricao(txtDescricao.getText());
            obj.setDisponibilidade((String) cbDisponibilidade.getSelectedItem());   
            obj.setObs(txtobs.getText());
            
            ClasseContainer objcac = new ClasseContainer();
            objcac.cadastrarContainer(obj);
            
            limpaCampos();
            desabilitaCampos();
            listarContainer();
        }
    }
    
    public final void ListarCadastros(){
        
        String tipoSelecionadoC = (String) cbTipoProdutoPesquisa.getSelectedItem();
         String tipoConsulta = (String) cbTipoConsulta.getSelectedItem();
         
         if("Selecione".equals(tipoSelecionadoC)){
            JOptionPane.showMessageDialog(null, "Selecione o tipo do produto");
            
         }else if("Selecione".equals(tipoConsulta)){ //Consulta caso usuario não selecione tipo de consulta
             
             if("Caçamba".equals(tipoSelecionadoC)){
               listarCacamba();
               
             }else if("Container".equals(tipoSelecionadoC)){
               listarContainer();
             }
             
             
         }else if("Código".equals(tipoConsulta) && "Caçamba".equals(tipoSelecionadoC)){ //Consulta por código
             
             int cod = Integer.parseInt(txtPesquisa.getText());
             listarCacambaPorCodigo(cod);                         
             
         }else if("Código".equals(tipoConsulta) && "Container".equals(tipoSelecionadoC)){ //Consulta por código
             
             int cod = Integer.parseInt(txtPesquisa.getText());
             listarContainerPorCodigo(cod);                       
   
         }else if("Descrição".equals(tipoConsulta) && "Caçamba".equals(tipoSelecionadoC)){ //Consulta caçamba por Descrição
             String Descricao = "%" + txtPesquisa.getText() + "%";
             listarCacambaPorDescricao(Descricao);
             
         }else if("Descrição".equals(tipoConsulta) && "Container".equals(tipoSelecionadoC)){ //Consulta container por Descrição
             String Descricao = "%" + txtPesquisa.getText() + "%";
             listarContainerPorDescricao(Descricao);
             
         } else if("Tamanho".equals(tipoConsulta) && "Caçamba".equals(tipoSelecionadoC)){ //Consulta container por Descrição
             String Tamanho = "%" + txtPesquisa.getText() + "%";
             listarCacambaPorTamanho(Tamanho);
             
         } else if("Tamanho".equals(tipoConsulta) && "Container".equals(tipoSelecionadoC)){ //Consulta container por Descrição
             String Tamanho = "%" + txtPesquisa.getText() + "%";
             listarContainerPorTamanho(Tamanho);
         
         }else if("Disponibilidade".equals(tipoConsulta) && "Caçamba".equals(tipoSelecionadoC)){ //Consulta container por Descrição
             String Disponibilidade = "%" + txtPesquisa.getText() + "%";
             listarCacambaPorDisponibilidade(Disponibilidade);
         
         }else if("Disponibilidade".equals(tipoConsulta) && "Container".equals(tipoSelecionadoC)){ //Consulta container por Descrição
             String Disponibilidade = "%" + txtPesquisa.getText() + "%";
             listarContainerPorDisponibilidade(Disponibilidade);
         }
    }    
    
    public final void AlterarCadastros(){
            String tipoSelecionado = (String) cbTipo.getSelectedItem();
            String tamanhoSelecionado = (String) cbTamanho.getSelectedItem(); 
            
            if("Selecione".equals(tipoSelecionado)){
                JOptionPane.showMessageDialog(null, "Selecione o tipo do produto");
            } 

            else if ("Selecione".equals(tamanhoSelecionado)){
                JOptionPane.showMessageDialog(null, "Selecione o tamanho do produto");
            }
            
            else if(txtpreco.getText().equals("   .  ")){
                JOptionPane.showMessageDialog(null, "Preço não pode ser vazio");
            }           

            else if(txtDescricao.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Insira uma descrição para o produto!");
        }

            else if ("Caçamba".equals(tipoSelecionado)){
                Cacamba obj = new Cacamba();
                obj.setTamanho((String) cbTamanho.getSelectedItem());
                obj.setPreco_unitario(Double.parseDouble( txtpreco.getText()));
                obj.setDescricao(txtDescricao.getText());
                obj.setDisponibilidade((String) cbDisponibilidade.getSelectedItem());   
                obj.setObs(txtobs.getText()); 
                int selectedRow = tabelaProdutos.getSelectedRow();
                obj.setId(Integer.parseInt(tabelaProdutos.getValueAt(selectedRow, 0).toString()));


                ClasseCacamba objcac = new ClasseCacamba();
                objcac.alterarCacamba(obj);

                limpaCampos();
                desabilitaCampos();
                btnNovo.setEnabled(true);
                btnSalvaEdicao.setEnabled(false);
                btnCancelar.setEnabled(false);
                btnExcluir.setEnabled(false);
                btnEditar.setEnabled(true);

            }else if ("Container".equals(tipoSelecionado)){
                Containers obj = new Containers();
                obj.setTamanho((String) cbTamanho.getSelectedItem());
                obj.setPreco_unitario(Double.parseDouble( txtpreco.getText()));
                obj.setDescricao(txtDescricao.getText());
                obj.setDisponibilidade((String) cbDisponibilidade.getSelectedItem());  
                obj.setObs(txtobs.getText()); 
                int selectedRow = tabelaProdutos.getSelectedRow();
                obj.setId(Integer.parseInt(tabelaProdutos.getValueAt(selectedRow, 0).toString()));

                ClasseContainer objcac = new ClasseContainer();
                objcac.alterarContainer(obj);

                limpaCampos();
                desabilitaCampos();
                btnNovo.setEnabled(true);
                btnSalvaEdicao.setEnabled(false);
                btnCancelar.setEnabled(false);
                btnExcluir.setEnabled(false);
                btnEditar.setEnabled(true);

        }
     
               
    }
        
    
    //Métodos para funções auxiliares
    
    public final void tema(){

        try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        }
            catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException erro)
        {
            JOptionPane.showMessageDialog(null, erro);
        }
    } 

    public final void habilitaCampos(){
        txtDescricao.setEnabled(true);
        txtpreco.setEnabled(true);
        txtobs.setEnabled(true);
        cbDisponibilidade.setEnabled(true);
        cbTamanho.setEnabled(true);
        cbTipo.setEnabled(true);
        //btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);

    }
    
    public final void desabilitaCampos(){
        
        
        txtDescricao.setEnabled(false);
        txtpreco.setEnabled(false);
        txtobs.setEnabled(false);
        cbDisponibilidade.setEnabled(false);
        cbTamanho.setEnabled(false);
        cbTipo.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnSalvaEdicao.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnNovo.setEnabled(true);
        
    }
    
    public final void limpaCampos(){
        txtDescricao.setText("");
        txtpreco.setText("");
        txtobs.setText("");
        cbDisponibilidade.setSelectedItem("Selecione");
        cbTamanho.setSelectedItem("Selecione");
        cbTipo.setSelectedItem("Selecione");
        btnSalvar.setEnabled(false);
        
    }      
    
    
    public final void validarTipoTamanho(){
            String tiposelecionado = (String) cbTipo.getSelectedItem();
            String tamanhoselecionado = (String) cbTamanho.getSelectedItem();

            if("Container".equals(tiposelecionado)){
                cbTamanho.setSelectedItem("Container");
                cbTamanho.setEnabled(false);
            }else{
                cbTamanho.setEnabled(true);
            }

            if("Caçamba".equals(tiposelecionado) && "U".equals(tamanhoselecionado)){
                cbTamanho.setSelectedItem("Caçamba");
            }           
                       

            if("U".equals(tamanhoselecionado) && !"Container".equals(tiposelecionado)){
                JOptionPane.showMessageDialog(null, "Selecione um tamanho válido para a caçamba");
                cbTamanho.setSelectedItem("Selecione");

            }else if(!"U".equals(tamanhoselecionado) && "Container".equals(tiposelecionado)){
                JOptionPane.showMessageDialog(null, "Selecione um tamanho válido para o container (U)");
                cbTamanho.setSelectedItem("U");
            }
        
        
        }
    /*
     public void preencher(){
        String tipoSelecionado = (String) cbTipo.getSelectedItem();

                // Limpa o JComboBox "Tamanho"
                cbTamanho.removeAllItems();

                // Adiciona as opções apropriadas com base na seleção do tipo de produto
                if ("Container".equals(tipoSelecionado)) {
                    cbTamanho.addItem("Selecione");
                    cbTamanho.addItem("U");
                } else if ("Caçamba".equals(tipoSelecionado)) {
                    cbTamanho.addItem("Selecione");
                    cbTamanho.addItem("G");
                    cbTamanho.addItem("M");
                    cbTamanho.addItem("P");
                }
    }*/
             
}




