package ru.firstproject.dao.impls;/*
package ru.izebit.dao.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.izebit.dao.ArticleDao;
import ru.izebit.model.Article;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class SQLiteDAO implements ArticleDao{
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
//реализация через спринг
    @Override
    public void submit(Article article) {
        String sql = "insert into article (name, author) VALUES (?, ?)";
        jdbcTemplate.update(sql,new Object[]{article.getTitle(),article.getContent()});
    }
*/
/*

    // реализация через стандартные средства
    public void insertWithJDBC(Article article) {
        Connection con = null;

        try {
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc::sqlite:db/SpringDB.db";
            con = DriverManager.getConnection(url, "user", "password");
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql = "insert into article (Title, Content) VALUES (?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, getTitle);
            ps.setString(2, getContent);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                }
            }
        }
    }
*//*


    @Override
    public void delete(Article article) {

    }
    @Override
    public Article getArticleById() {
        return null;
    }

    @Override
    public Article getArticleById(int id) {
        return null;
    }

    @Override
    public List<Article> getArticleListByTitle(String name) {
        return null;
    }

    @Override
    public List<Article> getArticleListByContent(String author) {
        return null;
    }
}
*/
