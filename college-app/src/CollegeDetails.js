import React, { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import axios from 'axios';

function CollegeDetails() {
    const { id } = useParams();
    const [college, setCollege] = useState(null);

    useEffect(() => {
        axios.get(`http://localhost:8080/api/colleges/${id}`)
            .then(response => setCollege(response.data))
            .catch(error => console.error('Error fetching the college', error));
    }, [id]);

    if (!college) {
        return <div>Loading...</div>;
    }

    return (
        <div>
            <h1>{college.name} - {college.courseName}</h1>
            <p>Duration: {college.durationOfCourse}</p>
            <p>Accommodation: {college.accommodationType}</p>
            <p>Accommodation Fee: {college.accommodationFee}</p>
            <p>Course Fee: {college.courseFee.fee}</p>
        </div>
    );
}

export default CollegeDetails;
