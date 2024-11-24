# Write your MySQL query statement below
With Process_time as (
    select machine_id, process_id, (MAX(timestamp) - MIN(timestamp)) as time_taken
    from Activity
    group by machine_id,process_id
),
Average_time as (
    select machine_id, Round(AVG(time_taken),3) as processing_time
    from Process_time
    group by machine_id
) 

Select machine_id, processing_time
from Average_time
order by machine_id


