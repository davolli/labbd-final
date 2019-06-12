
package primeiroexemplo;


import java.sql.*;
import java.util.ArrayList;


public class ConexaoBD {

    private Connection myConnection;
    private Statement st;
    private String err = null;
    private Boolean status;


    public  ConexaoBD(int tipo){
        try{

            Class.forName("org.postgresql.Driver").newInstance();
            if (tipo == 0) {
              myConnection = DriverManager.getConnection("jdbc:postgresql://localhost/museu?user=dir&password=111");  
            } else {
                myConnection = DriverManager.getConnection("jdbc:postgresql://localhost/museu?user=vis&password=111");
            }
            
            st = myConnection.createStatement();

        }
        catch (Exception e){
            e.printStackTrace();

        }
    }
    
    public String getError() {
        return this.err;
    }
    
    public ArrayList consulta2 (String estado, Integer acc, Integer seg){

        //ResultSet rs = null;
        ArrayList res = new ArrayList();
        
        PreparedStatement ps;
        ResultSet rs;

        ConsultaDoisEnt doisEnt;

        try{
            // st.execute("select * from consulta_dois('MT')");
            String SQL;
            SQL = "select * from consulta_dois('"+estado+"',"+acc+","+seg+")";
            //SQL = "select * from consulta_dois('MT',1,1)";
            ps = myConnection.prepareStatement(SQL);
            rs = ps.executeQuery();
            //rs = ps.getResultSet();
            int i=0;
            while (rs.next()){
                doisEnt = new ConsultaDoisEnt (
                        rs.getString(1),rs.getString(2),rs.getString(3),
                rs.getString(4), rs.getString(5));
                res.add(doisEnt);
            }
            this.status = true;
            //System.out.print(i);

        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return res;
    }
public ArrayList consulta1 (String tipologia){

        //ResultSet rs = null;
        ArrayList res = new ArrayList();
        
        PreparedStatement ps;
        ResultSet rs;
        
        ConsultaUmEnt umEnt;

        try{
            // st.execute("select * from consulta_dois('MT')");
            String SQL;
            SQL = "select * from consulta_um('"+tipologia+"')";
            //SQL = "select * from tipologiadoacervo";
            ps = myConnection.prepareStatement(SQL);
            rs = ps.executeQuery();
            //rs = ps.getResultSet();
            int i=0;
            while (rs.next()){
                umEnt = new ConsultaUmEnt (
                        rs.getString(1), rs.getString(2), rs.getString(3), 
                        rs.getString(4), rs.getString(5), rs.getString(6));
                res.add(umEnt);
            }

            this.status = true;
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return res;
    }

    public void fechar() {
        if (myConnection != null) {
            try {
                myConnection.close();
            } catch (SQLException e) { /* ignored */}
        }
    }
    public Boolean getStatus() {
        return this.status;
    }
}
