SELECT a1.machine_id, ROUND(AVG(a2.timestamp-a1.timestamp),3) as processing_time
FROM Activity as a1
JOIN Activity as a2
ON a1.process_id = a2.process_id
AND a1.machine_id = a2.machine_id
AND a1.timestamp < a2.timestamp
GROUP BY machine_id
