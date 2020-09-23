import React from 'react';
import './App.css';
import Navbar from './components/Navbar';
import { BrowserRouter as Router, Switch, Route} from 'react-router-dom';
import Home from './pages/Home'
import AddExercise from './pages/AddExercise'
import ShowExercises from './pages/ShowExercises'
import About from './pages/About'

function App() {
  return (
    <>
      <Router>
        <Navbar />
        <Switch>
          <Route path='/' exact component={Home} />
          <Route path='/add-exercise' component={AddExercise} />
          <Route path='/show-exercises' component={ShowExercises} />
          <Route path='/about' component={About} />
        </Switch>
      </Router>
    </>
  );
}

export default App;
