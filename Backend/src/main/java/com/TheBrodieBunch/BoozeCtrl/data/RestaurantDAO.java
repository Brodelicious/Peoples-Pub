package com.TheBrodieBunch.BoozeCtrl.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.TheBrodieBunch.beans.*;

@Repository
public interface RestaurantDAO extends JpaRepository<Special, Integer>{
}

