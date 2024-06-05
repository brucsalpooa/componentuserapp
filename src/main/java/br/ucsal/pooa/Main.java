package br.ucsal.pooa;

import com.example.SqlQueryBuilder;

public class Main {

    /**
     * Método principal para executar a aplicação
     * 
     * @param args argumentos da linha de comando
     */
    public static void main(String[] args) {
        SqlQueryBuilder builder = new SqlQueryBuilder()
                .table("users")
                .select("id", "name", "email")
                .where("active = 1");

        String sql = builder.build();
        System.out.println("SQL Gerado: " + sql);
    }
}