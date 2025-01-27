# Week2_Labs

Exercise 1a.
Nurses, Drugs, Equipment, Wards, OT.

Exercise 1b.

Doctor class Attributes:
- dr_id: int += 1
- name: String = “name”
- specialty: String = “specialty”
- availability: Boolean = “available”

Behaviors:
+ Doctor()
+ Doctor(dr_id: int, name: String, speciality:String, available: boolean)
+ getAvailability(): Date
+ getPaged(): String

Patient class Attributes:

- pt_id: int += 1 
- name: String = “name”
- ward: String = “ward”
- illness: String = “illness”
- condition: String = “condition”

Behaviors:
+ Patient()
+ Patient(pt_id: int, name: String, ward: String, illness: String, condition: String)
+ getCondition(): String
+ getVitals(): String

