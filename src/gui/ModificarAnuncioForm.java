package gui;

import file.AgenciaFile;
import model.Administrador;
import model.Anuncio;
import model.CatalogoAnuncios;
import model.Cliente;
import model.Inmobiliaria;
import model.TipoEstadoInmueble;
import model.TipoInmueble;
import model.TipoOperacion;

public class ModificarAnuncioForm extends javax.swing.JFrame {

    public Inmobiliaria inmobiliaria;
    public AgenciaFile file;
    public Administrador administrador;
    public Anuncio anuncio;

    public ModificarAnuncioForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSuperficie = new javax.swing.JLabel();
        txtSuperficie = new java.awt.TextField();
        cbtipoInmueble = new javax.swing.JComboBox<>();
        lblTipoInmueble = new javax.swing.JLabel();
        lblFotoInmueble = new javax.swing.JLabel();
        txtFotoInmueble = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        lblInformacionAnuncio = new javax.swing.JLabel();
        pFormulario = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        panelAñadir = new javax.swing.JPanel();
        lblMunicipio = new javax.swing.JLabel();
        cbMunicipio = new javax.swing.JComboBox<>();
        lblCalle = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        lblCodigoPostal = new javax.swing.JLabel();
        txCodigoPostal = new javax.swing.JTextField();
        lblNumeroInmueble = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        pIsoLabel = new javax.swing.JLabel();
        txtPiso = new javax.swing.JTextField();
        lblInfoDireccion = new javax.swing.JLabel();
        lblTituloAnuncio = new javax.swing.JLabel();
        txtTituloAnuncio = new javax.swing.JTextField();
        lblDescripcionAnuncio = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtAreaDescripcionAnuncio = new javax.swing.JTextArea();
        lblNumeroHabitaciones = new javax.swing.JLabel();
        cbNumHabitaciones = new javax.swing.JComboBox<>();
        lblNumBaños = new javax.swing.JLabel();
        cbNumBaños = new javax.swing.JComboBox<>();
        lblEstadoInmueble = new javax.swing.JLabel();
        cbEstadoInmueble = new javax.swing.JComboBox<>();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new java.awt.TextField();
        rbAlquiler = new javax.swing.JRadioButton();
        rbVenta = new javax.swing.JRadioButton();
        lblSuperficie1 = new javax.swing.JLabel();
        txtSuperficie1 = new java.awt.TextField();
        cbtipoInmueble1 = new javax.swing.JComboBox<>();
        lblTipoInmueble1 = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();

        lblSuperficie.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblSuperficie.setForeground(new java.awt.Color(255, 255, 255));
        lblSuperficie.setText("Superficie m2 :");

        txtSuperficie.setForeground(new java.awt.Color(102, 102, 102));
        txtSuperficie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuperficieActionPerformed(evt);
            }
        });
        txtSuperficie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSuperficieKeyReleased(evt);
            }
        });

        cbtipoInmueble.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Piso", "Casa", "Chalet", "Apartamento" }));
        cbtipoInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtipoInmuebleActionPerformed(evt);
            }
        });

        lblTipoInmueble.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblTipoInmueble.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoInmueble.setText("Tipo de Inmueble : ");

        lblFotoInmueble.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblFotoInmueble.setForeground(new java.awt.Color(255, 255, 255));
        lblFotoInmueble.setText("Foto del Inmueble : ");

        txtFotoInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFotoInmuebleActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnVolver.setBackground(new java.awt.Color(53, 121, 56));
        btnVolver.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver atras");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblInformacionAnuncio.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblInformacionAnuncio.setText("Informacion del Anuncio");

        pFormulario.setBackground(new java.awt.Color(53, 121, 56));

        btnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(53, 121, 56));
        btnActualizar.setText("Actualizar Anuncio");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        lblMunicipio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblMunicipio.setText("Municipio:");

        cbMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Las Palmas de Gran Canaria", "Telde", "Agaete", "Aguimes", "Artenara", "Arucas", "Firgas", "Galdar", "Ingenio", "La Aldea de San Nicolas", "Mogán", "Moya", "San Bartolomé de Tirajana", "Santa Brigida", "Santa Lucía de Tirajana", "Santa Maria de Guía", "Tejeda", "Teror", "Valleseco", "Valsequillo de Gran Canaria", "Vega San Mateo" }));
        cbMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMunicipioActionPerformed(evt);
            }
        });

        lblCalle.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCalle.setText("Calle :");

        txtCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalleActionPerformed(evt);
            }
        });
        txtCalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCalleKeyReleased(evt);
            }
        });

        lblCodigoPostal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCodigoPostal.setText("Codigo Postal:");

        txCodigoPostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCodigoPostalActionPerformed(evt);
            }
        });
        txCodigoPostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txCodigoPostalKeyReleased(evt);
            }
        });

        lblNumeroInmueble.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblNumeroInmueble.setText("Numero : ");

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumeroKeyReleased(evt);
            }
        });

        pIsoLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pIsoLabel.setText("Piso :");

        txtPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPisoActionPerformed(evt);
            }
        });
        txtPiso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPisoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelAñadirLayout = new javax.swing.GroupLayout(panelAñadir);
        panelAñadir.setLayout(panelAñadirLayout);
        panelAñadirLayout.setHorizontalGroup(
            panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAñadirLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAñadirLayout.createSequentialGroup()
                        .addGroup(panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCalle)
                            .addComponent(lblMunicipio))
                        .addGap(18, 18, 18)
                        .addGroup(panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelAñadirLayout.createSequentialGroup()
                        .addGroup(panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCodigoPostal)
                            .addComponent(lblNumeroInmueble)
                            .addComponent(pIsoLabel))
                        .addGap(18, 18, 18)
                        .addGroup(panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPiso, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(txCodigoPostal)
                            .addComponent(txtNumero))))
                .addGap(44, 44, 44))
        );
        panelAñadirLayout.setVerticalGroup(
            panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAñadirLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMunicipio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCalle)
                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoPostal)
                    .addComponent(txCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroInmueble)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pIsoLabel))
                .addGap(32, 32, 32))
        );

        lblInfoDireccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblInfoDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoDireccion.setText("Informacion de la direccion");

        lblTituloAnuncio.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloAnuncio.setText("TItulo del Anuncio:");

        txtTituloAnuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloAnuncioActionPerformed(evt);
            }
        });

        lblDescripcionAnuncio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDescripcionAnuncio.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcionAnuncio.setText("Descripcion del Anuncio");

        txtAreaDescripcionAnuncio.setColumns(20);
        txtAreaDescripcionAnuncio.setRows(5);
        jScrollPane6.setViewportView(txtAreaDescripcionAnuncio);

        lblNumeroHabitaciones.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblNumeroHabitaciones.setForeground(new java.awt.Color(255, 255, 255));
        lblNumeroHabitaciones.setText("Número de habitaciones : ");

        cbNumHabitaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        cbNumHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNumHabitacionesActionPerformed(evt);
            }
        });

        lblNumBaños.setForeground(new java.awt.Color(255, 255, 255));
        lblNumBaños.setText("Numero de baños:");

        cbNumBaños.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        cbNumBaños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNumBañosActionPerformed(evt);
            }
        });

        lblEstadoInmueble.setForeground(new java.awt.Color(255, 255, 255));
        lblEstadoInmueble.setText("Estado del Inmueble:");

        cbEstadoInmueble.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Buen estado", "Pendiente de reformar", "Nueva Obra" }));

        lblPrecio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio.setText("Precio :");

        txtPrecio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(102, 102, 102));
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioKeyReleased(evt);
            }
        });

        rbAlquiler.setBackground(new java.awt.Color(53, 121, 56));
        rbAlquiler.setForeground(new java.awt.Color(255, 255, 255));
        rbAlquiler.setText("Alquiler");
        rbAlquiler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbAlquilerMouseClicked(evt);
            }
        });
        rbAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlquilerActionPerformed(evt);
            }
        });
        rbAlquiler.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rbAlquilerKeyPressed(evt);
            }
        });

        rbVenta.setBackground(new java.awt.Color(53, 121, 56));
        rbVenta.setForeground(new java.awt.Color(255, 255, 255));
        rbVenta.setText("Venta");
        rbVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbVentaMouseClicked(evt);
            }
        });
        rbVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVentaActionPerformed(evt);
            }
        });
        rbVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rbVentaKeyPressed(evt);
            }
        });

        lblSuperficie1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblSuperficie1.setForeground(new java.awt.Color(255, 255, 255));
        lblSuperficie1.setText("Superficie m2 :");

        txtSuperficie1.setForeground(new java.awt.Color(102, 102, 102));
        txtSuperficie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuperficie1ActionPerformed(evt);
            }
        });
        txtSuperficie1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSuperficie1KeyReleased(evt);
            }
        });

        cbtipoInmueble1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "PISO", "CASA", "CHALET", "APARTAMENTO" }));
        cbtipoInmueble1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtipoInmueble1ActionPerformed(evt);
            }
        });

        lblTipoInmueble1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblTipoInmueble1.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoInmueble1.setText("Tipo de Inmueble : ");

        javax.swing.GroupLayout pFormularioLayout = new javax.swing.GroupLayout(pFormulario);
        pFormulario.setLayout(pFormularioLayout);
        pFormularioLayout.setHorizontalGroup(
            pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFormularioLayout.createSequentialGroup()
                .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pFormularioLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(lblInfoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pFormularioLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pFormularioLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pFormularioLayout.createSequentialGroup()
                                        .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFormularioLayout.createSequentialGroup()
                                        .addComponent(rbAlquiler)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbVenta)))))))
                .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pFormularioLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(cbtipoInmueble1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFormularioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDescripcionAnuncio)
                            .addGroup(pFormularioLayout.createSequentialGroup()
                                .addComponent(lblTituloAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTituloAnuncio))
                            .addGroup(pFormularioLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane6)
                                    .addGroup(pFormularioLayout.createSequentialGroup()
                                        .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblSuperficie1)
                                            .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblNumeroHabitaciones)
                                                .addGroup(pFormularioLayout.createSequentialGroup()
                                                    .addGap(22, 22, 22)
                                                    .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lblNumBaños)
                                                        .addComponent(lblEstadoInmueble)
                                                        .addComponent(lblTipoInmueble1)))))
                                        .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pFormularioLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(cbEstadoInmueble, 0, 173, Short.MAX_VALUE)
                                                    .addComponent(cbNumBaños, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(cbNumHabitaciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFormularioLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txtSuperficie1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addGap(0, 44, Short.MAX_VALUE))
        );
        pFormularioLayout.setVerticalGroup(
            pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFormularioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfoDireccion)
                    .addComponent(lblTituloAnuncio)
                    .addComponent(txtTituloAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pFormularioLayout.createSequentialGroup()
                        .addComponent(panelAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbAlquiler)
                            .addComponent(rbVenta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pFormularioLayout.createSequentialGroup()
                        .addComponent(lblDescripcionAnuncio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSuperficie1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSuperficie1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbNumHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumeroHabitaciones))
                        .addGap(12, 12, 12)
                        .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbNumBaños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumBaños))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbEstadoInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEstadoInmueble))
                        .addGap(18, 18, 18)
                        .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbtipoInmueble1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipoInmueble1))
                        .addGap(52, 52, 52))))
        );

        lblError.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblError.setForeground(new java.awt.Color(53, 121, 56));
        lblError.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblInformacionAnuncio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(306, 306, 306))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInformacionAnuncio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        AdminForm adminForm = new AdminForm();
        adminForm.inmobiliaria = inmobiliaria;
        adminForm.file = file;
        adminForm.administrador = administrador;
        adminForm.setLocationRelativeTo(null);
        adminForm.setVisible(true);
        adminForm.setTextSesion();
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        for (Cliente cliente : inmobiliaria.getClientes()) {
            for (Anuncio a : cliente.getAnuncios()) {
                if (a.equals(anuncio)) {
                    modificarAnuncio(a);
                }
            }
        }

        for (CatalogoAnuncios catalogo : inmobiliaria.getCatalogo()) {
            for (Anuncio a : catalogo.getAnuncios()) {
                if (a.equals(anuncio)) {
                    modificarAnuncio(a);
                }
            }
        }

        file.saveToFileCatalogo(inmobiliaria);
        file.saveToFileClientes(inmobiliaria);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void modificarAnuncio(Anuncio a) {
        a.setTitulo(txtTituloAnuncio.getText());
        a.setDescripcion(txtAreaDescripcionAnuncio.getText());
        a.setPrecio(Integer.parseInt(txtPrecio.getText()));
        if (rbAlquiler.isSelected()) {
            a.setTipoOperacion(TipoOperacion.ALQUILER);
        } else {
            a.setTipoOperacion(TipoOperacion.VENTA);
        }
        a.getInmueble().setDireccion(txtCalle.getText(), txtPiso.getText(), cbMunicipio.getSelectedItem().toString(), Integer.parseInt(txtNumero.getText()), Integer.parseInt(txCodigoPostal.getText()));
        a.getInmueble().setNumeroDeWc(Integer.parseInt(cbNumBaños.getSelectedItem().toString()));
        a.getInmueble().setNumeroHabitaciones(Integer.parseInt(cbNumHabitaciones.getSelectedItem().toString()));
        a.getInmueble().setSuperficie(Double.parseDouble(txtSuperficie1.getText()));

        TipoEstadoInmueble tipoEstadoInmueble = TipoEstadoInmueble.BUENESTADO;
        if (cbEstadoInmueble.getSelectedItem().toString().equals("Pendiente de reformar")) {
            tipoEstadoInmueble = TipoEstadoInmueble.PENDIENTEREFORMAR;
        } else if (cbEstadoInmueble.getSelectedItem().toString().equals("Nueva Obra")) {
            tipoEstadoInmueble = TipoEstadoInmueble.NUEVAOBRA;
        }
        a.getInmueble().setTipoEstadoInmueble(tipoEstadoInmueble);

        TipoInmueble tipoInmueble = TipoInmueble.CASA;

        if (cbtipoInmueble1.getSelectedItem().toString().equals("PISO")) {
            tipoInmueble = TipoInmueble.PISO;
        }
        if (cbtipoInmueble1.getSelectedItem().toString().equals("CHALET")) {
            tipoInmueble = TipoInmueble.CHALET;
        }
        if (cbtipoInmueble1.getSelectedItem().toString().equals("APARTAMENTO")) {
            tipoInmueble = TipoInmueble.APARTAMENTO;
        }
        a.getInmueble().setTipoInmueble(tipoInmueble);
        
        lblError.setText("Se ha modificado el anuncio correctamente.");
    }
    private void cbMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMunicipioActionPerformed
    }//GEN-LAST:event_cbMunicipioActionPerformed

    private void txtCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalleActionPerformed
    }//GEN-LAST:event_txtCalleActionPerformed

    private void txtCalleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCalleKeyReleased
    }//GEN-LAST:event_txtCalleKeyReleased

    private void txCodigoPostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCodigoPostalActionPerformed
    }//GEN-LAST:event_txCodigoPostalActionPerformed

    private void txCodigoPostalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txCodigoPostalKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txCodigoPostalKeyReleased

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void txtNumeroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroKeyReleased

    private void txtPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPisoActionPerformed
    }//GEN-LAST:event_txtPisoActionPerformed

    private void txtPisoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPisoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPisoKeyReleased

    private void cbNumHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNumHabitacionesActionPerformed
    }//GEN-LAST:event_cbNumHabitacionesActionPerformed

    private void cbNumBañosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNumBañosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNumBañosActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioKeyReleased

    private void rbAlquilerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbAlquilerMouseClicked
    }//GEN-LAST:event_rbAlquilerMouseClicked

    private void rbAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlquilerActionPerformed
    }//GEN-LAST:event_rbAlquilerActionPerformed

    private void rbAlquilerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbAlquilerKeyPressed
    }//GEN-LAST:event_rbAlquilerKeyPressed

    private void rbVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbVentaMouseClicked
    }//GEN-LAST:event_rbVentaMouseClicked

    private void rbVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVentaActionPerformed
    }//GEN-LAST:event_rbVentaActionPerformed

    private void rbVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbVentaKeyPressed
    }//GEN-LAST:event_rbVentaKeyPressed

    private void txtSuperficieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuperficieActionPerformed
    }//GEN-LAST:event_txtSuperficieActionPerformed

    private void txtSuperficieKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSuperficieKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuperficieKeyReleased

    private void cbtipoInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtipoInmuebleActionPerformed
    }//GEN-LAST:event_cbtipoInmuebleActionPerformed

    private void txtFotoInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFotoInmuebleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFotoInmuebleActionPerformed

    private void txtSuperficie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuperficie1ActionPerformed
    }//GEN-LAST:event_txtSuperficie1ActionPerformed

    private void txtSuperficie1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSuperficie1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuperficie1KeyReleased

    private void cbtipoInmueble1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtipoInmueble1ActionPerformed

    }//GEN-LAST:event_cbtipoInmueble1ActionPerformed

    private void txtTituloAnuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloAnuncioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloAnuncioActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarAnuncioForm().setVisible(true);
            }
        });
    }

    public void establecerDatos() {
        cbMunicipio.setSelectedItem(anuncio.getInmueble().getDireccion().getMunicipio());
        txtCalle.setText(anuncio.getInmueble().getDireccion().getCalle());
        txCodigoPostal.setText(String.valueOf(anuncio.getInmueble().getDireccion().getZipCode()));
        txtNumero.setText(String.valueOf(anuncio.getInmueble().getDireccion().getNumero()));
        txtPiso.setText(String.valueOf(anuncio.getInmueble().getDireccion().getPiso()));
        txtTituloAnuncio.setText(anuncio.getTitulo());
        txtAreaDescripcionAnuncio.setText(anuncio.getDescripcion());
        txtPrecio.setText(String.valueOf(anuncio.getPrecio()));
        cbNumHabitaciones.setSelectedItem(String.valueOf(anuncio.getInmueble().getNumeroHabitaciones()));
        cbNumBaños.setSelectedItem(String.valueOf(anuncio.getInmueble().getNumeroDeWc()));
        txtSuperficie1.setText(String.valueOf(anuncio.getInmueble().getSuperficie()));

        String tipoEstadoInmueble = anuncio.getInmueble().getTipoEstadoInmueble().toString();
        switch (tipoEstadoInmueble) {
            case "PENDIENTEREFORMAR":
                cbEstadoInmueble.setSelectedItem("Pendiente de reformar");
                break;
            case "BUENESTADO":
                cbEstadoInmueble.setSelectedItem("Buen estado");
                break;
            default:
                cbEstadoInmueble.setSelectedItem("Nueva Obra");
        }

        cbtipoInmueble1.setSelectedItem(anuncio.getInmueble().getTipoInmueble().toString());

        if (anuncio.getTipoOperacion().toString().equals("VENTA")) {
            rbVenta.setSelected(true);
        } else {
            rbAlquiler.setSelected(true);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbEstadoInmueble;
    private javax.swing.JComboBox<String> cbMunicipio;
    private javax.swing.JComboBox<String> cbNumBaños;
    private javax.swing.JComboBox<String> cbNumHabitaciones;
    private javax.swing.JComboBox<String> cbtipoInmueble;
    private javax.swing.JComboBox<String> cbtipoInmueble1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblCalle;
    private javax.swing.JLabel lblCodigoPostal;
    private javax.swing.JLabel lblDescripcionAnuncio;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblEstadoInmueble;
    private javax.swing.JLabel lblFotoInmueble;
    private javax.swing.JLabel lblInfoDireccion;
    private javax.swing.JLabel lblInformacionAnuncio;
    private javax.swing.JLabel lblMunicipio;
    private javax.swing.JLabel lblNumBaños;
    private javax.swing.JLabel lblNumeroHabitaciones;
    private javax.swing.JLabel lblNumeroInmueble;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblSuperficie;
    private javax.swing.JLabel lblSuperficie1;
    private javax.swing.JLabel lblTipoInmueble;
    private javax.swing.JLabel lblTipoInmueble1;
    private javax.swing.JLabel lblTituloAnuncio;
    private javax.swing.JPanel pFormulario;
    private javax.swing.JLabel pIsoLabel;
    private javax.swing.JPanel panelAñadir;
    private javax.swing.JRadioButton rbAlquiler;
    private javax.swing.JRadioButton rbVenta;
    private javax.swing.JTextField txCodigoPostal;
    private javax.swing.JTextArea txtAreaDescripcionAnuncio;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtFotoInmueble;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPiso;
    private java.awt.TextField txtPrecio;
    private java.awt.TextField txtSuperficie;
    private java.awt.TextField txtSuperficie1;
    private javax.swing.JTextField txtTituloAnuncio;
    // End of variables declaration//GEN-END:variables
}
