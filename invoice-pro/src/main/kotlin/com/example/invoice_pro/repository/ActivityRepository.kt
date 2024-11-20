package com.example.invoice_pro.repository

import com.example.invoice_pro.entity.Activity
import org.springframework.data.jpa.repository.JpaRepository

interface ActivityRepository : JpaRepository<Activity, Long>
