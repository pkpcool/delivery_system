/**
 * 
 */
package pkp.ltd.delivery_system.service;

import java.util.List;

import org.springframework.stereotype.Service;

import pkp.ltd.delivery_system.dto.entity.StatSlot;
import pkp.ltd.delivery_system.dto.entity.StatUnit;

/**
 * @author pankajkumar
 *
 */

@Service
public interface StaticService {

	public List<StatSlot> getSlots();
	
	public List<StatUnit> getUnits();
}
