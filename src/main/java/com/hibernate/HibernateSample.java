/****************************************************************************************
 * $RCSfile: eclipse-codetemplates.xml,v $  $Revision: 1.4 $  $Date: 2014/10/10 20:48:18 $
 * Copyright 2008,2014 All rights reserved. NBS Payment Solutions Inc.
 *
 ****************************************************************************************/

package com.hibernate;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

/**
 * @author dchoi@nbsps.com
 *
 */
public class HibernateSample {
    
    private NamedParameterJdbcTemplate jdbcTemplate;

    /*
    public List<TerminalStatusSummary> getTerminalStatus(int orgId) {

        WebUtils.checkOrganizationAccess(orgId);

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Object[]> criteria = cb.createQuery(Object[].class);
        Root<Device> device = criteria.from(Device.class);
        Join<Device, Location> location = device.join("location");
        Join<Location, DeviceOwner> deviceOwner = location.join("deviceOwner");
        Join<Device, DeviceState> deviceState = device.join("deviceState");

        criteria.where(cb.equal(deviceOwner, orgId));
        criteria.multiselect(deviceState.get("name"),
                cb.count(device.get("id"))).groupBy(deviceState.get("name"));

        List<TerminalStatusSummary> lists = new ArrayList<TerminalStatusSummary>();

        List<Object[]> results = em.createQuery(criteria).getResultList();
        for (Object[] object : results) {
            TerminalStatusSummary terminalStatusSummary = new TerminalStatusSummary();
            terminalStatusSummary.setStatusName((String) object[0]);
            terminalStatusSummary.setTotalNumber((long) object[1]);

            lists.add(terminalStatusSummary);
        }

        return lists;
    }



    public AlertSummary getAlertSummary(int orgId) {
        Map<String, Object> paramMap = new HashMap<String,Object>();
        paramMap.put("orgId", orgId);
        
        AlertSummary alertSummary = jdbcTemplate.queryForObject(ALERT_SUMMARY_COUNTS, paramMap,
                new RowMapper<AlertSummary>() {
                    public AlertSummary mapRow(ResultSet rs, int rowNum) throws SQLException {
                        AlertSummary row = new AlertSummary();
                        row.setTotalAlerts(rs.getInt("totalAlerts"));
                        row.setTotalAlertsOver24hrsOnState(rs.getInt("on_state_count_over_24hrs"));
                        row.setTotalAlertsOver24hrsOffState(rs.getInt("off_state_count_over_24hrs"));
                        row.setTotalAlertsUnder24hrsOnState(rs.getInt("on_state_count_under_24hrs"));
                        row.setTotalAlertsUnder24hrsOffState(rs.getInt("off_state_count_under_24hrs"));

                        return row;
                    }
                }
          );

        alertSummary.setAlertStateSummaryList(getAlertStateSummary(orgId));
        
        return alertSummary;
    }
    
    private List<AlertStateSummary> getAlertStateSummary(int orgId) {
        MapSqlParameterSource paramMap = new MapSqlParameterSource();
        
        LocalDate fromLastSixDays = new LocalDate().minusDays(SIX_DAYS);
        paramMap.addValue("FROM_LAST_SIX_DAYS", fromLastSixDays.toDate(), Types.DATE);
        paramMap.addValue("orgId", orgId);
        
        List<AlertStateSummary> obj = (List<AlertStateSummary>)jdbcTemplate.query(ALERT_COUNT_STATS, paramMap,
              new RowMapper<AlertStateSummary>() {
                  public AlertStateSummary mapRow(ResultSet rs, int rowNum) throws SQLException {
                      AlertStateSummary row = new AlertStateSummary();
                      
                      row.setGenTs(new DateTime(rs.getDate("gen_ts")).toString(DateTimeFormat.forPattern("dd-MMM")));
                      row.setTotalOnStateCount(rs.getInt("on_state_count"));
                      row.setTotalOffStateCount(rs.getInt("off_state_count"));
                      return row;
                  }
              }
       );
        return obj;
      
    }
    */
    

    
    

}
