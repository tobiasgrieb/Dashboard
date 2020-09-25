import React, { useState, useEffect } from 'react'
import { makeStyles } from '@material-ui/core/styles';
import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableContainer from '@material-ui/core/TableContainer';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';
import Paper from '@material-ui/core/Paper';
import axios from 'axios'
import '../css/ShowExercises.css'

const useStyles = makeStyles({
  table: {
    minWidth: '20%',
    maxWidth: '50%',
    margin: 'auto'
  },
});

export default function ShowExercises() {
  const classes = useStyles();

  const [posts, setPosts] = useState([])

  useEffect(() => {
    axios.get('http://localhost:8080/api/v1/breathing-exercise')
      .then(res => {
        console.log(res)
        setPosts(res.data)
      })
      .catch(err => {
        console.log(err)
      })
  })

  return (
    <div>
      <h1>List of all breathing exercises</h1>
      <TableContainer component={Paper}>
        <Table className={classes.table} aria-label="simple table">
          <TableHead>
            <TableRow>
              <TableCell >Date</TableCell>
              <TableCell >Breathing repetitions</TableCell>
            </TableRow>
          </TableHead>
          <TableBody>
            {posts.map((row) => (
              <TableRow key={""}>
                <TableCell >{row.date}</TableCell>
                <TableCell >{row.breathingRepetitions}</TableCell>
              </TableRow>
            ))}
          </TableBody>
        </Table>
      </TableContainer>
    </div>
  );
}
