import React, { useState, useEffect } from 'react'
import '../css/ShowExercises.css'
import Button from '@material-ui/core/Button'
import axios from 'axios'
import 'react-base-table/styles.css'

function ShowExercises() {
  const [posts, setPosts] = useState([])

  useEffect(() => {
    axios.get('http://localhost:8080/api/v1/exercise')
      .then(res => {
        console.log(res)
        setPosts(res.data)
      })
      .catch(err => {
        console.log(err)
      })
  })

  return (
    <div className='exercises'>
      <h1>Here you can see all exercises you did in the past</h1>
        {posts.map(post => (
          <p className='exercise-data'>Date: {post.date} ~~~~~~ Repetitions: {post.breathingRepetitions}</p>
        ))}
    </div>
  )

}

export default ShowExercises
