import React from 'react';
import * as AiIcons from 'react-icons/ai'
import * as IoIcons from 'react-icons/io'
import * as FcIcons from 'react-icons/fc'

export const SidebarData = [
  {
    title: 'Home',
    path: '/',
    icon: <AiIcons.AiFillHome />,
    cName: 'nav-text'
  },
  {
    title: 'Add exercise',
    path: '/add-exercise',
    icon: <FcIcons.FcPlus />,
    cName: 'nav-text'
  },
  {
    title: 'Show exercises',
    path: '/show-exercises',
    icon: <FcIcons.FcList />,
    cName: 'nav-text'
  },
  {
    title: 'About',
    path: '/about',
    icon: <FcIcons.FcAbout />,
    cName: 'nav-text'
  },
]
