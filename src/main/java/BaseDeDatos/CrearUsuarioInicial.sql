/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Cristobal Barrios
 * Created: 8/10/2024
 */

-- USER SQL
CREATE USER "PROYECTOPROGRA" IDENTIFIED BY "proyectoprogra"  ;

-- QUOTAS

-- ROLES
GRANT "DBA" TO "PROYECTOPROGRA" ;
GRANT "CONNECT" TO "PROYECTOPROGRA" ;
GRANT "RESOURCE" TO "PROYECTOPROGRA" ;

-- SYSTEM PRIVILEGES