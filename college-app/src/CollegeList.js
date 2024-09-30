import React, { useEffect, useState } from 'react';
import axios from 'axios';

function CollegeList() {
    const [colleges, setColleges] = useState([]);

    useEffect(() => {
        axios.get('http://localhost:8080/api/colleges')
            .then(response => setColleges(response.data))
            .catch(error => console.error('Error fetching the colleges', error));
    }, []);

    return (
        <div className='container' >
            
            <h1>College List for Abroad Studies</h1>
            
             <table>
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Course Name</th>
                        <th>Duration</th>
                        <th>Accommodation</th>
                        <th>Accommodation Fee</th>
                        <th>Course Fee</th>
                    </tr>
                </thead>
                <tbody>
                    {colleges.map(college => (
                        <tr key={college.id}>
                            <td>{college.name}</td>
                            <td>{college.courseName}</td>
                            <td>{college.durationOfCourse}</td>
                            <td>{college.accommodationType}</td>
                            <td>{college.accommodationFee}</td>
                            <td>{college.courseFee ? college.courseFee.fee : 'N/A'}</td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
}

export default CollegeList;
