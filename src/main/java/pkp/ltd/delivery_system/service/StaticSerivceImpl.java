/**
 * 
 */
package pkp.ltd.delivery_system.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pkp.ltd.delivery_system.dto.entity.StatSlot;
import pkp.ltd.delivery_system.dto.entity.StatUnit;
import pkp.ltd.delivery_system.jpa.repository.StatSlotRepository;
import pkp.ltd.delivery_system.jpa.repository.StatUnitRepository;

/**
 * @author pankajkumar
 *
 */
@Service
public class StaticSerivceImpl implements StaticService {
	private static final Logger LOGGER= LoggerFactory.getLogger(StaticSerivceImpl.class);

	@Autowired
	private StatSlotRepository slotRepo;
	
	@Autowired
	private StatUnitRepository unitRepo;
	
	private static List<StatSlot> slots;
	
	private static List<StatUnit> units; 
	/* (non-Javadoc)
	 * @see pkp.ltd.delivery_system.service.StaticService#getSlots()
	 */
	@Override
	public List<StatSlot> getSlots() {
		LOGGER.info("Getting Slots.");
		if(slots==null) {
			LOGGER.info("Initializing slots.");
			slots= new ArrayList<>();
					slotRepo.findAll().forEach(slot->{
						StatSlot slot1= new StatSlot(); 
						BeanUtils.copyProperties(slot, slot1);
						slots.add(slot1);
					});
		}
		LOGGER.info("{} slots found.", slots.size());
		return slots;
	}
	@Override
	public List<StatUnit> getUnits() {
		LOGGER.info("Getting units.");
		if(units==null) {
			LOGGER.info("Initializing units.");
			units= new ArrayList<>();
					unitRepo.findAll().forEach(unit->{
						StatUnit unit1= new StatUnit(); 
						BeanUtils.copyProperties(unit, unit1);
						units.add(unit1);
					});
		}
		LOGGER.info("{} units found.", units.size());
		return units;
	}

}
