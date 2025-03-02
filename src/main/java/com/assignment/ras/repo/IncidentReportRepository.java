package com.assignment.ras.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.assignment.ras.model.IncidentReport;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class IncidentReportRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public IncidentReport findByIrNumber(String irNumber) {
        String sql = "SELECT IRNumber, GroupRefNo FROM IncidentReports WHERE IRNumber = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{irNumber}, new RowMapper<IncidentReport>() {
            @Override
            public IncidentReport mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new IncidentReport(rs.getString("IRNumber"), rs.getString("GroupRefNo"));
            }
        });
    }
}
