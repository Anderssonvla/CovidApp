/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

/**
 *
 * @author Ezequiel
 */
public class ReportForm extends javax.swing.JFrame {

    /**
     * Creates new form ReportForm
     */
    public ReportForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblPorGeneros = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCantidadMujer = new javax.swing.JLabel();
        lblCantidadHombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTotalCasos = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblCantidadHombreFallecidos = new javax.swing.JLabel();
        lblCantidadMujerFallecidos = new javax.swing.JLabel();
        lblTotalFallecidos = new javax.swing.JLabel();
        lblMunicipio1 = new javax.swing.JLabel();
        lblMunicipio2 = new javax.swing.JLabel();
        lblMunicipio3 = new javax.swing.JLabel();
        lblCantidadMunicipio1 = new javax.swing.JLabel();
        lblCantidadMunicipio2 = new javax.swing.JLabel();
        lblCantidadMunicipio = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblMunicipio4 = new javax.swing.JLabel();
        lblMunicipio5 = new javax.swing.JLabel();
        lblMunicipio6 = new javax.swing.JLabel();
        lblCantidadDepartamento3 = new javax.swing.JLabel();
        lblCantidadDepartamento2 = new javax.swing.JLabel();
        lblCantidadDepartamento1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblCantidadRecuperadosMujer = new javax.swing.JLabel();
        lblCantidadRecuperadosHombre = new javax.swing.JLabel();
        lblTotalCasosRecuperados = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblCantidadDepartamentoRecuperados = new javax.swing.JLabel();
        lblCantidadCasosMunicipioRecuperados = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblTotalRecuperadosDepMun = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1190, 492));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Reporte de casos de COVID-19");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblPorGeneros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPorGeneros.setText("Numero de casos por genero");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Numero de casos por municipio");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Mujer");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Hombre");

        lblCantidadMujer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCantidadMujer.setForeground(new java.awt.Color(153, 0, 0));
        lblCantidadMujer.setText("Cantidad");

        lblCantidadHombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCantidadHombre.setForeground(new java.awt.Color(153, 0, 0));
        lblCantidadHombre.setText("Cantidad");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Total");

        lblTotalCasos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTotalCasos.setForeground(new java.awt.Color(153, 0, 0));
        lblTotalCasos.setText("Cantidad total");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Numero de casos fallecidos");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Mujer");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Total");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Hombre");

        lblCantidadHombreFallecidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCantidadHombreFallecidos.setForeground(new java.awt.Color(153, 0, 0));
        lblCantidadHombreFallecidos.setText("Cantidad");

        lblCantidadMujerFallecidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCantidadMujerFallecidos.setForeground(new java.awt.Color(153, 0, 0));
        lblCantidadMujerFallecidos.setText("Cantidad");

        lblTotalFallecidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTotalFallecidos.setForeground(new java.awt.Color(153, 0, 0));
        lblTotalFallecidos.setText("Cantidad total");

        lblMunicipio1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMunicipio1.setText("Municipio");

        lblMunicipio2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMunicipio2.setText("Municipio");

        lblMunicipio3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMunicipio3.setText("Municipio");

        lblCantidadMunicipio1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCantidadMunicipio1.setForeground(new java.awt.Color(153, 0, 0));
        lblCantidadMunicipio1.setText("Cantidad");

        lblCantidadMunicipio2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCantidadMunicipio2.setForeground(new java.awt.Color(153, 0, 0));
        lblCantidadMunicipio2.setText("Cantidad");

        lblCantidadMunicipio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCantidadMunicipio.setForeground(new java.awt.Color(153, 0, 0));
        lblCantidadMunicipio.setText("Cantidad");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Numero de casos por departamento");

        lblMunicipio4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMunicipio4.setText("Departamento");

        lblMunicipio5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMunicipio5.setText("Departamento");

        lblMunicipio6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMunicipio6.setText("Departamento");

        lblCantidadDepartamento3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCantidadDepartamento3.setForeground(new java.awt.Color(153, 0, 0));
        lblCantidadDepartamento3.setText("Cantidad");

        lblCantidadDepartamento2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCantidadDepartamento2.setForeground(new java.awt.Color(153, 0, 0));
        lblCantidadDepartamento2.setText("Cantidad");

        lblCantidadDepartamento1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCantidadDepartamento1.setForeground(new java.awt.Color(153, 0, 0));
        lblCantidadDepartamento1.setText("Cantidad");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Numero de casos recuperados");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Mujer");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Hombre");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Total");

        lblCantidadRecuperadosMujer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCantidadRecuperadosMujer.setForeground(new java.awt.Color(153, 0, 0));
        lblCantidadRecuperadosMujer.setText("Cantidad");

        lblCantidadRecuperadosHombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCantidadRecuperadosHombre.setForeground(new java.awt.Color(153, 0, 0));
        lblCantidadRecuperadosHombre.setText("Cantidad");

        lblTotalCasosRecuperados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTotalCasosRecuperados.setForeground(new java.awt.Color(153, 0, 0));
        lblTotalCasosRecuperados.setText("Cantidad total");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Casos recuperados por departamento/municipio");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Departamento ");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Municipio");

        lblCantidadDepartamentoRecuperados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCantidadDepartamentoRecuperados.setForeground(new java.awt.Color(153, 0, 0));
        lblCantidadDepartamentoRecuperados.setText("Cantidad");

        lblCantidadCasosMunicipioRecuperados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCantidadCasosMunicipioRecuperados.setForeground(new java.awt.Color(153, 0, 0));
        lblCantidadCasosMunicipioRecuperados.setText("Cantidad");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Total");

        lblTotalRecuperadosDepMun.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTotalRecuperadosDepMun.setForeground(new java.awt.Color(153, 0, 0));
        lblTotalRecuperadosDepMun.setText("Cantidad total");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/gender-symbols.png"))); // NOI18N
        jLabel19.setText("jLabel19");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel19.setMaximumSize(new java.awt.Dimension(64, 64));
        jLabel19.setMinimumSize(new java.awt.Dimension(64, 64));
        jLabel19.setPreferredSize(new java.awt.Dimension(64, 64));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMunicipio1)
                            .addComponent(lblMunicipio2)
                            .addComponent(lblMunicipio3))
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCantidadMunicipio1)
                            .addComponent(lblCantidadMunicipio2)
                            .addComponent(lblCantidadMunicipio)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCantidadDepartamento2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCantidadDepartamento1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCantidadDepartamento3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18))
                        .addGap(114, 114, 114)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotalRecuperadosDepMun, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCantidadDepartamentoRecuperados, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCantidadCasosMunicipioRecuperados, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jLabel15)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCantidadHombreFallecidos, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTotalFallecidos, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCantidadMujerFallecidos, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCantidadMujer, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblCantidadHombre, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblTotalCasos)))
                                .addGap(71, 71, 71))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblPorGeneros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(34, 34, 34))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel13)
                                                        .addComponent(jLabel12))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel14)
                                                        .addGap(17, 17, 17)))
                                                .addGap(71, 71, 71)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(34, 34, 34)
                                                        .addComponent(lblCantidadRecuperadosMujer))
                                                    .addComponent(lblTotalCasosRecuperados, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblCantidadRecuperadosHombre, javax.swing.GroupLayout.Alignment.TRAILING)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(347, 347, 347)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMunicipio4)
                                    .addComponent(lblMunicipio6)
                                    .addComponent(lblMunicipio5)
                                    .addComponent(jLabel6))))))
                .addGap(190, 190, 190)
                .addComponent(jLabel7)
                .addGap(85, 85, 85))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblCantidadMujerFallecidos)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblCantidadHombreFallecidos)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblTotalFallecidos))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblMunicipio1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblMunicipio2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblMunicipio3))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblCantidadMunicipio1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblCantidadMunicipio2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblCantidadMunicipio))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblPorGeneros)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(lblCantidadMujer))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(lblCantidadHombre))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(lblTotalCasos)))))
                .addGap(163, 163, 163)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCantidadCasosMunicipioRecuperados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCantidadDepartamentoRecuperados))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel16)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel17)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel18))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblCantidadDepartamento1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblCantidadDepartamento2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblCantidadDepartamento3)
                                                .addComponent(lblTotalRecuperadosDepMun))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblMunicipio4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblMunicipio5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblMunicipio6))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblCantidadRecuperadosMujer)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCantidadRecuperadosHombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTotalCasosRecuperados))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ReportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCantidadCasosMunicipioRecuperados;
    private javax.swing.JLabel lblCantidadDepartamento1;
    private javax.swing.JLabel lblCantidadDepartamento2;
    private javax.swing.JLabel lblCantidadDepartamento3;
    private javax.swing.JLabel lblCantidadDepartamentoRecuperados;
    private javax.swing.JLabel lblCantidadHombre;
    private javax.swing.JLabel lblCantidadHombreFallecidos;
    private javax.swing.JLabel lblCantidadMujer;
    private javax.swing.JLabel lblCantidadMujerFallecidos;
    private javax.swing.JLabel lblCantidadMunicipio;
    private javax.swing.JLabel lblCantidadMunicipio1;
    private javax.swing.JLabel lblCantidadMunicipio2;
    private javax.swing.JLabel lblCantidadRecuperadosHombre;
    private javax.swing.JLabel lblCantidadRecuperadosMujer;
    private javax.swing.JLabel lblMunicipio1;
    private javax.swing.JLabel lblMunicipio2;
    private javax.swing.JLabel lblMunicipio3;
    private javax.swing.JLabel lblMunicipio4;
    private javax.swing.JLabel lblMunicipio5;
    private javax.swing.JLabel lblMunicipio6;
    private javax.swing.JLabel lblPorGeneros;
    private javax.swing.JLabel lblTotalCasos;
    private javax.swing.JLabel lblTotalCasosRecuperados;
    private javax.swing.JLabel lblTotalFallecidos;
    private javax.swing.JLabel lblTotalRecuperadosDepMun;
    // End of variables declaration//GEN-END:variables
}
